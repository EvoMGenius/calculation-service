package ru.bunkov.calculation.service.equipment.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchEquipmentArgument {
    String equipmentType;

    BigDecimal averageCost;
}
