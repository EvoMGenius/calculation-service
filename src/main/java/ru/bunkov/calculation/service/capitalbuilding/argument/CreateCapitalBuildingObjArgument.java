package ru.bunkov.calculation.service.capitalbuilding.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateCapitalBuildingObjArgument {
    String type;

    Double cost;
}
