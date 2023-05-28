package ru.bunkov.calculation.service.income.argument;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CreatePotentialIncomeArgument {

    String typeOfBusiness;

    Double potentialAnnualIncome;

    Double rate;

    Double totalPotentCost;

}
