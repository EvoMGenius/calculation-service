package ru.bunkov.calculation.api.external.industry.dto;

import lombok.Data;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.CreateSubindustryDto;

import java.util.List;

@Data
public class CreateIndustryDto {

    private String name;

    private List<CreateSubindustryDto> subindustry;
}
