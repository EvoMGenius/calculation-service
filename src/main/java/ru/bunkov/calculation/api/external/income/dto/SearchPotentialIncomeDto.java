package ru.bunkov.calculation.api.external.income.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SearchPotentialIncomeDto {
    private String typeOfBusiness;

    private BigDecimal potentialAnnualIncome;

    private BigDecimal rate;

    private BigDecimal totalPotentCost;
}
