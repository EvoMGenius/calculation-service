package ru.bunkov.calculation.api.external.calculation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bunkov.calculation.action.calculation.CreateCalculationAction;
import ru.bunkov.calculation.api.external.calculation.dto.CalculationDto;
import ru.bunkov.calculation.api.external.calculation.dto.CreateCalculationDto;
import ru.bunkov.calculation.api.external.calculation.dto.OtherTaxDto;
import ru.bunkov.calculation.model.calculation.Calculation;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/calculation")
public class CalculationController {

    private final CreateCalculationAction createCalculationAction;

    @PostMapping("calc")
    public CalculationDto calculate(@RequestBody CreateCalculationDto dto) {
        Calculation calculation = createCalculationAction.execute(dto);

        return CalculationDto.builder()
                             .id(calculation.getId())
                             .capitalInvestmentsLandCostMinTotalLandCost(calculation.getCapitalInvestments().getLandCost().getMinTotalLandCost())
                             .capitalInvestmentsLandCostMaxTotalLandCost(calculation.getCapitalInvestments().getLandCost().getMaxTotalLandCost())
                             .capitalInvestmentsTotalBuildingCost(calculation.getCapitalInvestments().getTotalBuildingCost().getTotalBuildingCost())
                             .capitalInvestmentsCapitalTotalBuildingCost(calculation.getCapitalInvestments().getTotalCapitalBuildingCost().getTotalCapitalBuildingCost())
                             .capitalInvestmentsTotalMinCost(calculation.getCapitalInvestments().getTotalCostMin())
                             .capitalInvestmentsTotalMaxCost(calculation.getCapitalInvestments().getTotalCostMax())
                             .costsOfOpeningProductionEquipmentPurchasePriceTotalEquipmentCost(calculation.getCostsOfOpeningProduction().getEquipmentPurchasePrice().getTotalEquipmentCost())
                             .costsOfOpeningProductionHiringStaffTotalStaffCost(calculation.getCostsOfOpeningProduction().getHiringStaff().getTotalStaffCost())
                             .costsOfOpeningProductionPurchasePatentPatentCost(calculation.getCostsOfOpeningProduction().getPurchasePatent().getPatentCost())
                             .costsOfOpeningProductionTotalCost(calculation.getCostsOfOpeningProduction().getTotalCostOfOpeningProduction())
                             .otherTax(new OtherTaxDto(calculation.getExpenses().getOtherTax()))
                             .expensesJobPaymentTotalJobPayment(calculation.getExpenses().getJobPayment().getTotalJobPayment())
                             .expensesJobPaymentTotalPayedSalary(calculation.getExpenses().getJobPayment().getTotalPayedSalary())
                             .expensesJobPaymentMainTaxes(calculation.getExpenses().getJobPayment().getMainTaxes())
                             .accountingCost(calculation.getAccountingCost())
                             .initialExpenses(calculation.getInitialExpenses())
                             .totalCostMinOfAll(calculation.getTotalCostMinOfAll())
                             .totalCostMaxOfAll(calculation.getTotalCostMaxOfAll())
                             .build();
    }
}
