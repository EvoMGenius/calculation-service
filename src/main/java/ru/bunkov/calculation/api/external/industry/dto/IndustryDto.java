package ru.bunkov.calculation.api.external.industry.dto;

import lombok.Data;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;

import java.util.List;
import java.util.UUID;

@Data
public class IndustryDto {

    private UUID id;

    private String name;

    private List<SubindustryDto> subindustry;
}
