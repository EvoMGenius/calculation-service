package ru.bunkov.calculation.service.industry.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchIndustryArgument {

    String name;
}
