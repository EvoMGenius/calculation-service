package ru.bunkov.calculation.service.equipment.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchEquipmentArgument {
    String equipmentType;

    Double averageCost;
}
