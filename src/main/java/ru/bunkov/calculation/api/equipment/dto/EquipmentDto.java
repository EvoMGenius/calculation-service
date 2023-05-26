package ru.bunkov.calculation.api.equipment.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class EquipmentDto {

    private UUID id;

    private String equipmentType;

    private Double averageCost;
}
