package ru.bunkov.calculation.api.external.income.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class PotentialIncomeDto {
    private UUID id;

    private String typeOfBusiness;

    private BigDecimal potentialAnnualIncome;

    private BigDecimal rate;

    private BigDecimal totalPotentCost;
}
