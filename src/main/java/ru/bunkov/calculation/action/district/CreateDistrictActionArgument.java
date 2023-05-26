package ru.bunkov.calculation.action.district;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;

import java.util.List;

@Value
@Builder
public class CreateDistrictActionArgument {

    String district;

    List<RegionDto> regions;

    Double averageCost;
}
