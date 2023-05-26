package ru.bunkov.calculation.api.income.result.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ConditionalResultDto {
    private UUID id;

    private String conditionDescription;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
