package ru.bunkov.calculation.service.capitalbuilding.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchCapitalBuildingObjArgument {
    String type;

    Double cost;
}
