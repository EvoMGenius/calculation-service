package ru.bunkov.calculation.api.equipment.dto;

import lombok.Data;

@Data
public class CreateEquipmentDto {

    private String equipmentType;

    private Double averageCost;
}
