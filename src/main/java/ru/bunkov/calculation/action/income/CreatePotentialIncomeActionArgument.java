package ru.bunkov.calculation.action.income;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;

import java.util.List;

@Value
@Builder
public class CreatePotentialIncomeActionArgument {


    String typeOfBusiness;

    List<CreateConditionalResultDto> result;
}
