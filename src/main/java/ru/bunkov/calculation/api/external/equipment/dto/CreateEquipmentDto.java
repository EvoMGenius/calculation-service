package ru.bunkov.calculation.api.external.equipment.dto;

import lombok.Data;

@Data
public class CreateEquipmentDto {

    private String equipmentType;

    private Double averageCost;
}
