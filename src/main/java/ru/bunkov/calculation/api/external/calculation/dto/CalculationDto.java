package ru.bunkov.calculation.api.external.calculation.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CalculationDto {

    private UUID id;

    private Double capitalInvestmentsLandCostMinTotalLandCost;

    private Double capitalInvestmentsLandCostMaxTotalLandCost;

    private Double capitalInvestmentsTotalBuildingCost;

    private Double capitalInvestmentsCapitalTotalBuildingCost;

    private Double capitalInvestmentsTotalMinCost;

    private Double capitalInvestmentsTotalMaxCost;

    private Double costsOfOpeningProductionEquipmentPurchasePriceTotalEquipmentCost;

    private Double costsOfOpeningProductionHiringStaffTotalStaffCost;

    private Double costsOfOpeningProductionPurchasePatentPatentCost;

    private Double costsOfOpeningProductionTotalCost;

    private AllTaxDto allTax;

    private Double totalSalaryPayment;

    private Double accountingCost;

    private Double totalCostMinOfAll;

    private Double totalCostMaxOfAll;
}
