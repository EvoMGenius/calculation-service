package ru.bunkov.calculation.api.industry.dto;

import lombok.Data;
import ru.bunkov.calculation.api.industry.subindustry.dto.CreateSubindustryDto;

import java.util.List;

@Data
public class CreateIndustryDto {

    private String name;

    private List<CreateSubindustryDto> subindustry;
}
