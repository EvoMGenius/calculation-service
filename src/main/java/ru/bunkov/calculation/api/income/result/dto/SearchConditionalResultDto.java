package ru.bunkov.calculation.api.income.result.dto;

import lombok.Data;

@Data
public class SearchConditionalResultDto {
    private String conditionDescription;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
