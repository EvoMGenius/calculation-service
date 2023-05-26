package ru.bunkov.calculation.service.income.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.income.ConditionalResult;

import java.util.List;

@Value
@Builder
public class CreatePotentialIncomeArgument {

    String typeOfBusiness;

    List<ConditionalResult> result;

}
