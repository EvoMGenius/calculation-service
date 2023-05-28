package ru.bunkov.calculation.api.external.industry.subindustry.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SearchSubindustryDto {
    private String name;

    private BigDecimal averageEmployeeCount2020;

    private BigDecimal averageEmployeeCount2021;

    private BigDecimal averageSalary2020;

    private BigDecimal averageSalary2021;

    private BigDecimal taxToMoscowBudget2021;

    private BigDecimal taxToMoscowBudget2022;

    private BigDecimal incomeTax2021;

    private BigDecimal incomeTax2022;

    private BigDecimal propertyTax2021;

    private BigDecimal propertyTax2022;

    private BigDecimal landTax2021;

    private BigDecimal landTax2022;

    private BigDecimal personalIncomeTax2021;

    private BigDecimal personalIncomeTax2022;

    private BigDecimal transportTax2021;

    private BigDecimal transportTax2022;

    private BigDecimal otherTax2021;

    private BigDecimal otherTax2022;

    private BigDecimal taxSumm2021;

    private BigDecimal taxSumm2022;

    private BigDecimal spendOnHiringStaff2020;

    private BigDecimal spendOnHiringStaff2021;
}
