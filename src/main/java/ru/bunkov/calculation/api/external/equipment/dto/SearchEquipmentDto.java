package ru.bunkov.calculation.api.external.equipment.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SearchEquipmentDto {

    private String equipmentType;

    private BigDecimal averageCost;
}
