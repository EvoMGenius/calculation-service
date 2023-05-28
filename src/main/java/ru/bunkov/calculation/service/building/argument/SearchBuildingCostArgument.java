package ru.bunkov.calculation.service.building.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchBuildingCostArgument {

    String type;

    BigDecimal cost;
}
