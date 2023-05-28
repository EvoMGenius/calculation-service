package ru.bunkov.calculation.service.industry.subindustry.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchSubindustryArgument {
    String name;

    BigDecimal averageEmployeeCount2020;

    BigDecimal averageEmployeeCount2021;

    BigDecimal averageSalary2020;

    BigDecimal averageSalary2021;

    BigDecimal taxToMoscowBudget2021;

    BigDecimal taxToMoscowBudget2022;

    BigDecimal incomeTax2021;

    BigDecimal incomeTax2022;

    BigDecimal propertyTax2021;

    BigDecimal propertyTax2022;

    BigDecimal landTax2021;

    BigDecimal landTax2022;

    BigDecimal personalIncomeTax2021;

    BigDecimal personalIncomeTax2022;

    BigDecimal transportTax2021;

    BigDecimal transportTax2022;

    BigDecimal otherTax2021;

    BigDecimal otherTax2022;

    BigDecimal taxSumm2021;

    BigDecimal taxSumm2022;

    BigDecimal spendOnHiringStaff2020;

    BigDecimal spendOnHiringStaff2021;
}
