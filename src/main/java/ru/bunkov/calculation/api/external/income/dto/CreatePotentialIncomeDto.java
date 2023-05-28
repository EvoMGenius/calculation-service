package ru.bunkov.calculation.api.external.income.dto;

import lombok.Data;

@Data
public class CreatePotentialIncomeDto {

    private String typeOfBusiness;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
