package ru.bunkov.calculation.service.capitalbuilding.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchCapitalBuildingObjArgument {
    String type;

    BigDecimal cost;
}
