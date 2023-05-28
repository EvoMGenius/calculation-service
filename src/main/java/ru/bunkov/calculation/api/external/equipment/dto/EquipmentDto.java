package ru.bunkov.calculation.api.external.equipment.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class EquipmentDto {

    private UUID id;

    private String equipmentType;

    private BigDecimal averageCost;
}
