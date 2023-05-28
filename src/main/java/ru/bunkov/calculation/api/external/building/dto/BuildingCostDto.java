package ru.bunkov.calculation.api.external.building.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class BuildingCostDto {
    private UUID id;

    private String type;

    private BigDecimal cost;
}
