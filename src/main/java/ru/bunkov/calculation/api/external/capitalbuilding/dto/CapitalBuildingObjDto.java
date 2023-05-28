package ru.bunkov.calculation.api.external.capitalbuilding.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CapitalBuildingObjDto {
    private UUID id;

    private String type;

    private Double cost;
}
