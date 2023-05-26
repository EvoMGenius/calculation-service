package ru.bunkov.calculation.api.industry.dto;

import lombok.Data;
import ru.bunkov.calculation.api.industry.subindustry.dto.SubindustryDto;

import java.util.List;

@Data
public class IndustryDto {

    private String name;

    private List<SubindustryDto> subindustry;
}
