package ru.bunkov.calculation.service.income.result.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateConditionalResultArgument {
    String conditionDescription;

    Double potentialAnnualIncome;

    Double rate;

    Double totalPotentCost;
}
