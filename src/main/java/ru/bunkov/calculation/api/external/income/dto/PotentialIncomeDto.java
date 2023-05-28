package ru.bunkov.calculation.api.external.income.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PotentialIncomeDto {
    private UUID id;

    private String typeOfBusiness;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
