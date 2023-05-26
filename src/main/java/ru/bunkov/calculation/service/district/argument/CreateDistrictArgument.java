package ru.bunkov.calculation.service.district.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.district.Region;

import java.util.List;

@Value
@Builder
public class CreateDistrictArgument {

    String district;

    List<Region> regions;

    Double averageCost;
}
