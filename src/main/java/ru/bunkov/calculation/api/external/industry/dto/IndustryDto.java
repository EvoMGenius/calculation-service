package ru.bunkov.calculation.api.external.industry.dto;

import lombok.Data;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;

import java.util.List;

@Data
public class IndustryDto {

    private String name;

    private List<SubindustryDto> subindustry;
}
