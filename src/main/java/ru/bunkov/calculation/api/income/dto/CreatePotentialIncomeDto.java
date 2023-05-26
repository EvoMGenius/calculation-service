package ru.bunkov.calculation.api.income.dto;

import lombok.Data;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;

import java.util.List;

@Data
public class CreatePotentialIncomeDto {

    private String typeOfBusiness;

    private List<CreateConditionalResultDto> result;
}
