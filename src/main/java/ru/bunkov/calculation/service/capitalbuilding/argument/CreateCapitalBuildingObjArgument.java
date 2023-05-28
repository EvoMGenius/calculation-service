package ru.bunkov.calculation.service.capitalbuilding.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class CreateCapitalBuildingObjArgument {
    String type;

    BigDecimal cost;
}
