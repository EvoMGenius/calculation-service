package ru.bunkov.calculation.service.district.region.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateRegionArgument {
    String name;

    Double rent;
}
