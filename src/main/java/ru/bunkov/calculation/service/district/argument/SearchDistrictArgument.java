package ru.bunkov.calculation.service.district.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchDistrictArgument {

    String district;

    Double averageCost;
}
