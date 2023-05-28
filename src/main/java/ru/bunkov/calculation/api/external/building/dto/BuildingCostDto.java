package ru.bunkov.calculation.api.external.building.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class BuildingCostDto {
    private UUID id;

    private String type;

    private Double cost;
}
