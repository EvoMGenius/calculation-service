package ru.bunkov.calculation.api.equipment.dto;

import lombok.Data;

@Data
public class SearchEquipmentDto {

    private String equipmentType;

    private Double averageCost;
}
