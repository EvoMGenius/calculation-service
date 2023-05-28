package ru.bunkov.calculation.api.external.equipment.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateEquipmentDto {

    private String equipmentType;

    private BigDecimal averageCost;
}
