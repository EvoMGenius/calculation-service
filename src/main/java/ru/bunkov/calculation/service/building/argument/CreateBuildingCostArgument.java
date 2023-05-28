package ru.bunkov.calculation.service.building.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateBuildingCostArgument {

   String type;

   Double cost;
}
