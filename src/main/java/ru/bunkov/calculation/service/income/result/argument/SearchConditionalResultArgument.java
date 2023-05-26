package ru.bunkov.calculation.service.income.result.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchConditionalResultArgument {
    String conditionDescription;

    Double potentialAnnualIncome;

    Double rate;

    Double totalPotentCost;
}
