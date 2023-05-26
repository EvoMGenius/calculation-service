package ru.bunkov.calculation.api.income.dto;

import lombok.Data;
import ru.bunkov.calculation.api.income.result.dto.ConditionalResultDto;

import java.util.List;
import java.util.UUID;

@Data
public class PotentialIncomeDto {
    private UUID id;

    private String typeOfBusiness;

    private List<ConditionalResultDto> result;
}
