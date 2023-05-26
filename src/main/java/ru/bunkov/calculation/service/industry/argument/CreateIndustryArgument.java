package ru.bunkov.calculation.service.industry.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.industry.Subindustry;

import java.util.List;

@Value
@Builder
public class CreateIndustryArgument {
    String name;
    List<Subindustry> subindustry;
}
