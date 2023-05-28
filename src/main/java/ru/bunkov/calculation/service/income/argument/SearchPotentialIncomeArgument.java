package ru.bunkov.calculation.service.income.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;

@Value
@Builder
public class SearchPotentialIncomeArgument {
    String typeOfBusiness;
    BigDecimal potentialAnnualIncome;

    BigDecimal rate;

    BigDecimal totalPotentCost;
}
