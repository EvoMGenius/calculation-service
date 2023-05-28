package ru.bunkov.calculation.action.calculation;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.api.external.calculation.dto.CreateCalculationDto;
import ru.bunkov.calculation.config.Constant;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.BuildingCost;
import ru.bunkov.calculation.model.CapitalBuildingObj;
import ru.bunkov.calculation.model.Equipment;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.accounting.Form;
import ru.bunkov.calculation.model.calculation.Calculation;
import ru.bunkov.calculation.model.calculation.Expenses;
import ru.bunkov.calculation.model.calculation.JobPayment;
import ru.bunkov.calculation.model.calculation.capitalinvestment.*;
import ru.bunkov.calculation.model.calculation.openingproductioncost.*;
import ru.bunkov.calculation.model.calculation.taxandsalary.OtherTax;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.model.region.Region;
import ru.bunkov.calculation.service.accounting.AccountingService;
import ru.bunkov.calculation.service.building.BuildingCostService;
import ru.bunkov.calculation.service.calculation.CalculationService;
import ru.bunkov.calculation.service.calculation.argument.CreateCalculationArgument;
import ru.bunkov.calculation.service.capitalbuilding.CapitalBuildingObjService;
import ru.bunkov.calculation.service.equipment.EquipmentService;
import ru.bunkov.calculation.service.income.PotentialIncomeService;
import ru.bunkov.calculation.service.industry.IndustryService;
import ru.bunkov.calculation.service.industry.subindustry.SubindustryService;
import ru.bunkov.calculation.service.region.RegionService;
import ru.bunkov.calculation.util.Tuple;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CreateCalculationAction {

    private final CalculationService calculationService;

    private final RegionService regionService;

    private final AccountingService accountingService;

    private final PotentialIncomeService potentialIncomeService;

    private final IndustryService industryService;

    private final SubindustryService subindustryService;

    private final BuildingCostService buildingCostService;

    private final CapitalBuildingObjService capitalBuildingObjService;

    private final EquipmentService equipmentService;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Calculation execute(CreateCalculationDto dto) {

        // landcost
        List<String> regionNames = dto.getRegionNames();
        List<Region> regions = regionService.findAllByNameIn(regionNames);
        BigDecimal total = BigDecimal.ZERO;
        for (Region region : regions) {
            total = total.add(region.getPurchaseLand());
        }

        total = total.divide(BigDecimal.valueOf(regions.size()));
        Double areaOnRegions = dto.getAreaOnRegions();
        total = total.multiply(BigDecimal.valueOf(areaOnRegions));

        BigDecimal maxLandTotal = total.multiply(BigDecimal.valueOf(1.15));
        BigDecimal minLandTotal = total.multiply(BigDecimal.valueOf(0.85));
        //landcost end

        //buildingcost
        List<Tuple<UUID, Double>> buildingCostIdAndAreaPairList = dto.getBuildingCostIdAndAreaPairList();

        List<Tuple<UUID, Double>> tuples = Lists.newArrayList(buildingCostIdAndAreaPairList);
        List<PairForBuilding> collectBuildingCostAndAreaList = tuples.stream()
                                                                     .map(uuidDoubleTuple -> PairForBuilding.builder()
                                                                                                            .buildingCostId(uuidDoubleTuple.getFirst())
                                                                                                            .area(uuidDoubleTuple.getSecond())
                                                                                                            .build()).collect(Collectors.toList());

        Set<UUID> buildingCostIds = new HashSet<>();

        buildingCostIdAndAreaPairList.forEach(uuidDoubleTuple -> buildingCostIds.add(uuidDoubleTuple.getFirst()));
        List<BuildingCost> buildingCosts = buildingCostService.findAllByIdsIn(buildingCostIds);
        BigDecimal totalBuildingCost = BigDecimal.ZERO;
        for (BuildingCost buildingCost : buildingCosts) {
            totalBuildingCost = totalBuildingCost.add(buildingCost.getCost());
        }
        //buildingcost end

        //capital buildingcost
        List<Tuple<UUID, Double>> capitalBuildingCostIdAndAreaPairList = dto.getOtherCapitalBuildingCostIdAndAreaPairList();

        List<Tuple<UUID, Double>> otherCapitalTuple = Lists.newArrayList(capitalBuildingCostIdAndAreaPairList);
        List<PairForCapitalBuilding> collectOtherCapilatBuildingCostAndAreaList = otherCapitalTuple.stream()
                                                                                                   .map(uuidDoubleTuple -> PairForCapitalBuilding.builder()
                                                                                                                                                 .buildingCostId(uuidDoubleTuple.getFirst())
                                                                                                                                                 .area(uuidDoubleTuple.getSecond())
                                                                                                                                                 .build()).collect(Collectors.toList());

        Set<UUID> capitalBuildingCostIds = new HashSet<>();

        capitalBuildingCostIdAndAreaPairList.forEach(uuidDoubleTuple -> capitalBuildingCostIds.add(uuidDoubleTuple.getFirst()));
        List<CapitalBuildingObj> otherCapiutalBuildingCosts = capitalBuildingObjService.findAllByIdsIn(capitalBuildingCostIds);
        BigDecimal totalOtherCapitalBuildingCost = BigDecimal.ZERO;
        for (CapitalBuildingObj capitalBuildingObj : otherCapiutalBuildingCosts) {
            totalOtherCapitalBuildingCost = totalOtherCapitalBuildingCost.add(capitalBuildingObj.getCost());
        }
        //capital buildingcost end

        //capitalInvestments
        BigDecimal capitalInvestmentsTotalCostMin = BigDecimal.ZERO;
        capitalInvestmentsTotalCostMin = capitalInvestmentsTotalCostMin.add(minLandTotal)
                                                                       .add(totalBuildingCost)
                                                                       .add(totalOtherCapitalBuildingCost);
        BigDecimal capitalInvestmentsTotalCostMax = BigDecimal.ZERO;
        capitalInvestmentsTotalCostMax = capitalInvestmentsTotalCostMax.add(maxLandTotal)
                                                                       .add(totalBuildingCost)
                                                                       .add(totalOtherCapitalBuildingCost);
        //capitalInvestments end

        // average salary matcher
        UUID industryId = dto.getIndustryId();
        UUID subindustryId = null;
        Optional<UUID> subindustryId1 = Optional.ofNullable(dto.getSubindustryId());
        if (subindustryId1.isPresent()) {
            subindustryId = subindustryId1.get();
        }

        BigDecimal currentAverageSalary;
        Optional<Double> salary = Optional.ofNullable(dto.getAverageSalary());

        Subindustry subind = null;
        if (salary.isPresent()) {
            currentAverageSalary = BigDecimal.valueOf(dto.getAverageSalary());
        } else {
            Industry industry = industryService.getExisting(industryId);
            List<Subindustry> subindustries = industry.getSubindustry();
            if (subindustryId != null) {
                UUID finalSubindustryId = subindustryId;
                Subindustry currentSubindustry = subindustries.stream()
                                                              .filter(subindustry -> subindustry.getId().equals(finalSubindustryId))
                                                              .findFirst()
                                                              .orElseThrow(NotFoundException::new);
                BigDecimal summSalary = currentSubindustry.getAverageSalary2020().add(currentSubindustry.getAverageSalary2021());
                summSalary = summSalary.divide(BigDecimal.valueOf(2));
                currentAverageSalary = summSalary;
                subind = currentSubindustry;
            } else {
                Subindustry currentSubindustry = subindustries.stream()
                                                              .filter(subindustry -> subindustry.getName().equals(industry.getName()))
                                                              .findFirst()
                                                              .orElseThrow(NotFoundException::new);
                BigDecimal summSalary = currentSubindustry.getAverageSalary2020().add(currentSubindustry.getAverageSalary2021());
                summSalary = summSalary.divide(BigDecimal.valueOf(2));
                currentAverageSalary = summSalary;
                subind = currentSubindustry;
            }
        }
        // average salary matcher end

        //hiringStaff
        BigDecimal averageSalary = currentAverageSalary;
        Double staffCount = dto.getStaffCount();

        BigDecimal totalStaffCost = BigDecimal.valueOf(staffCount)
                                              .multiply(averageSalary)
                                              .multiply(BigDecimal.valueOf(Constant.RATE * Constant.MONTHS));
        //hiringStaff end

        //equipmentPurchasePrice

        List<Tuple<UUID, Integer>> equipmentIdAndCountPairList = dto.getEquipmentIdAndCountPairList();

        BigDecimal totalEquipmentCost = BigDecimal.ZERO;
        for (Tuple<UUID, Integer> pairForEquipment : equipmentIdAndCountPairList) {
            System.out.println(pairForEquipment.getFirst().toString());
            System.out.println(pairForEquipment.getSecond());
            Equipment existing = equipmentService.getExisting(pairForEquipment.getFirst());
            totalEquipmentCost = totalEquipmentCost.add(existing.getAverageCost())
                                                   .multiply(BigDecimal.valueOf(pairForEquipment.getSecond()));
        }


        List<PairForEquipment> pairForEquipments = equipmentIdAndCountPairList.stream()
                                                                              .map(uuidIntegerTuple -> PairForEquipment.builder()
                                                                                                                       .equipmentId(uuidIntegerTuple.getFirst())
                                                                                                                       .count(uuidIntegerTuple.getSecond())
                                                                                                                       .build())
                                                                              .collect(Collectors.toList());


        //equipmentPurchasePrice end

        //purchasePatent

        BigDecimal totalPotentCost = BigDecimal.ZERO;

        String organizationalAndLegalForm = dto.getOrganizationalAndLegalForm();

        Optional<UUID> potentialIncomeId1 = Optional.ofNullable(dto.getPotentialIncomeId());

        if (organizationalAndLegalForm.equals(Form.IE.name()) && potentialIncomeId1.isPresent()) {
            UUID potentialIncomeId = potentialIncomeId1.get();
            PotentialIncome potentialIncome = potentialIncomeService.getExisting(potentialIncomeId);

            totalPotentCost = potentialIncome.getTotalPotentCost();
        }

        //purchasePatent end

        //costsOfOpeningProduction

        BigDecimal totalCostOfOpeningProduction = BigDecimal.ZERO;
        totalCostOfOpeningProduction = totalCostOfOpeningProduction.add(totalPotentCost)
                                                                   .add(totalEquipmentCost)
                                                                   .add(totalStaffCost);

        //costsOfOpeningProduction end

        // expenses

        BigDecimal jobPaymentTotalPayedSalary = averageSalary.multiply(BigDecimal.valueOf(dto.getStaffCount()));
        BigDecimal ndfl = jobPaymentTotalPayedSalary.multiply(BigDecimal.valueOf(0.13));
        BigDecimal sv = jobPaymentTotalPayedSalary.multiply(BigDecimal.valueOf(0.3));
        BigDecimal mainTaxes = ndfl.add(sv);

        BigDecimal totalJobPayment = mainTaxes.add(jobPaymentTotalPayedSalary);

        //other tax

        BigDecimal landTax2021 = subind.getLandTax2021();
        BigDecimal landTax2022 = subind.getLandTax2022();
        BigDecimal landTax = landTax2021.add(landTax2022);

        landTax = landTax.divide(BigDecimal.valueOf(2));

        BigDecimal propertyTax2021 = subind.getPropertyTax2021();
        BigDecimal propertyTax2022 = subind.getPropertyTax2022();
        BigDecimal propertyTax = propertyTax2021.add(propertyTax2022);

        propertyTax = propertyTax.divide(BigDecimal.valueOf(2));

        BigDecimal transportTax2021 = subind.getTransportTax2021();
        BigDecimal transportTax2022 = subind.getTransportTax2022();
        BigDecimal transportTax = transportTax2021.add(transportTax2022);

        transportTax = transportTax.divide(BigDecimal.valueOf(2));

        BigDecimal otherTax2021 = subind.getOtherTax2021();
        BigDecimal otherTax2022 = subind.getOtherTax2022();
        BigDecimal otherTax = otherTax2021.add(otherTax2022);

        otherTax = otherTax.divide(BigDecimal.valueOf(2));

        BigDecimal totalOtherTax = landTax.add(propertyTax).add(transportTax).add(otherTax);

//        areaOnRegions


        // other tax end

        // expenses end

        boolean usingAccountingService = dto.isUsingAccountingService();
        BigDecimal accountingCost = BigDecimal.ZERO;
        BigDecimal costTaxationSystemMin = BigDecimal.ZERO;
        BigDecimal costTaxationSystemMax = BigDecimal.ZERO;
        if (organizationalAndLegalForm.equals(Form.IE.name())) {
            Accounting accounting = accountingService.getByForm(Form.IE);
            if (dto.getTaxationSystemType().toLowerCase().equals("general")) {
                costTaxationSystemMin = accounting.getGeneralTaxationSystemMin();
                costTaxationSystemMax = accounting.getGeneralTaxationSystemMax();
            }
            if (dto.getTaxationSystemType().toLowerCase().equals("simplified")) {
                costTaxationSystemMin = accounting.getSimplifiedTaxationSystemMin();
                costTaxationSystemMax = accounting.getSimplifiedTaxationSystemMax();
            }
            if (dto.getTaxationSystemType().toLowerCase().equals("patent")) {
                costTaxationSystemMin = accounting.getPatentMin();
                costTaxationSystemMax = accounting.getPatentMax();
            }
        }
        accountingCost = costTaxationSystemMax.add(costTaxationSystemMin);
        accountingCost = accountingCost.divide(BigDecimal.valueOf(2));


        BigDecimal initialExpenses = BigDecimal.ZERO;
        if (organizationalAndLegalForm.equals(Form.IE.name())) {
            initialExpenses = initialExpenses.add(BigDecimal.valueOf(Constant.REGISTRATION_FEE_FOR_IE));
        }
        if (organizationalAndLegalForm.equals(Form.LLC.name())) {
            initialExpenses = initialExpenses.add(BigDecimal.valueOf(Constant.REGISTRATION_FEE_FOR_LE));
        }
        initialExpenses = initialExpenses.add(accountingCost);


        //total

        BigDecimal totalCostMinOfAll = minLandTotal.add(capitalInvestmentsTotalCostMin)
                                                   .add(totalCostOfOpeningProduction)
                                                   .add(totalJobPayment)
                                                   .add(totalOtherTax)
                                                   .add(accountingCost);

        BigDecimal totalCostMaxOfAll = minLandTotal.add(capitalInvestmentsTotalCostMax)
                                                   .add(totalCostOfOpeningProduction)
                                                   .add(totalJobPayment)
                                                   .add(totalOtherTax)
                                                   .add(accountingCost);

        //total end

        CreateCalculationArgument calculation = CreateCalculationArgument.builder()
                                                                         .capitalInvestments(CapitalInvestments.builder()
                                                                                                               .landCost(LandCost.builder()
                                                                                                                                 .regionNames(regionNames)
                                                                                                                                 .areaOnRegions(areaOnRegions)
                                                                                                                                 .minTotalLandCost(minLandTotal)
                                                                                                                                 .maxTotalLandCost(maxLandTotal)
                                                                                                                                 .build())
                                                                                                               .totalBuildingCost(TotalBuildingCost.builder()
                                                                                                                                                   .buildingCostIdAndAreaPairList(collectBuildingCostAndAreaList)
                                                                                                                                                   .totalBuildingCost(totalBuildingCost)
                                                                                                                                                   .build())
                                                                                                               .totalCapitalBuildingCost(TotalCapitalBuildingCost.builder()
                                                                                                                                                                 .capitalBuildingObjIdAndAreaPairList(collectOtherCapilatBuildingCostAndAreaList)
                                                                                                                                                                 .totalCapitalBuildingCost(totalOtherCapitalBuildingCost)
                                                                                                                                                                 .build())
                                                                                                               .totalCostMin(capitalInvestmentsTotalCostMin)
                                                                                                               .totalCostMax(capitalInvestmentsTotalCostMax)
                                                                                                               .build())
                                                                         .costsOfOpeningProduction(CostsOfOpeningProduction.builder()
                                                                                                                           .hiringStaff(HiringStaff.builder()
                                                                                                                                                   .averageSalary(averageSalary)
                                                                                                                                                   .staffCount(staffCount)
                                                                                                                                                   .totalStaffCost(totalStaffCost)
                                                                                                                                                   .build())
                                                                                                                           .equipmentPurchasePrice(EquipmentPurchasePrice.builder()
                                                                                                                                                                         .equipmentIdAndCountPairList(pairForEquipments)
                                                                                                                                                                         .totalEquipmentCost(totalEquipmentCost)
                                                                                                                                                                         .build())
                                                                                                                           .purchasePatent(PurchasePatent.builder()
                                                                                                                                                         .isIEAndTaxSystemIsPatent(Form.IE.name().equals(organizationalAndLegalForm))
                                                                                                                                                         .potentialIncomeId(dto.getPotentialIncomeId())
                                                                                                                                                         .patentCost(totalPotentCost)
                                                                                                                                                         .build())
                                                                                                                           .totalCostOfOpeningProduction(totalCostOfOpeningProduction)
                                                                                                                           .build())
                                                                         .expenses(Expenses.builder()
                                                                                           .industryId(industryId)
                                                                                           .subindustryId(subindustryId)
                                                                                           .jobPayment(JobPayment.builder()
                                                                                                                 .totalPayedSalary(jobPaymentTotalPayedSalary)
                                                                                                                 .mainTaxes(mainTaxes)
                                                                                                                 .totalJobPayment(totalJobPayment)
                                                                                                                 .build())
                                                                                           .otherTax(OtherTax.builder()
                                                                                                             .propertyTax(propertyTax)
                                                                                                             .landTax(landTax)
                                                                                                             .transportTax(transportTax)
                                                                                                             .otherTax(otherTax)
                                                                                                             .totalOtherTax(totalOtherTax)
                                                                                                             .build())
                                                                                           .build())
                                                                         .accountingCost(accountingCost)
                                                                         .initialExpenses(initialExpenses)
                                                                         .totalCostMinOfAll(totalCostMinOfAll)
                                                                         .totalCostMaxOfAll(totalCostMaxOfAll)
                                                                         .otherNeeds(dto.getOtherNeeds())
                                                                         .build();


        return calculationService.create(calculation);
    }
}
