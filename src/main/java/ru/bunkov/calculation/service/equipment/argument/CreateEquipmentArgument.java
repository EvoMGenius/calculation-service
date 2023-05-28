package ru.bunkov.calculation.service.equipment.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class CreateEquipmentArgument {
    String equipmentType;

    BigDecimal averageCost;
}
