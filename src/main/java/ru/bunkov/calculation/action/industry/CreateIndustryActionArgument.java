package ru.bunkov.calculation.action.industry;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;

import java.util.List;

@Value
@Builder
public class CreateIndustryActionArgument {

    String name;

    List<SubindustryDto> subindustry;
}
