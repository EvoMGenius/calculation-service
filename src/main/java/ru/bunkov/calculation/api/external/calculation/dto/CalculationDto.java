package ru.bunkov.calculation.api.external.calculation.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class CalculationDto {

    private UUID id;

    private BigDecimal capitalInvestmentsLandCostMinTotalLandCost;

    private BigDecimal capitalInvestmentsLandCostMaxTotalLandCost;

    private BigDecimal capitalInvestmentsTotalBuildingCost;

    private BigDecimal capitalInvestmentsCapitalTotalBuildingCost;

    private BigDecimal capitalInvestmentsTotalMinCost;

    private BigDecimal capitalInvestmentsTotalMaxCost;

    private BigDecimal costsOfOpeningProductionEquipmentPurchasePriceTotalEquipmentCost;

    private BigDecimal costsOfOpeningProductionHiringStaffTotalStaffCost;

    private BigDecimal costsOfOpeningProductionPurchasePatentPatentCost;

    private BigDecimal costsOfOpeningProductionTotalCost;

    private BigDecimal expensesJobPaymentTotalJobPayment;

    private BigDecimal expensesJobPaymentTotalPayedSalary;

    private BigDecimal expensesJobPaymentMainTaxes;

    private OtherTaxDto otherTax;

    private BigDecimal accountingCost;

    private BigDecimal initialExpenses;

    private BigDecimal totalCostMinOfAll;

    private BigDecimal totalCostMaxOfAll;
}
