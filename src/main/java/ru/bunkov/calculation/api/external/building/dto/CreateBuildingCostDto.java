package ru.bunkov.calculation.api.external.building.dto;

import lombok.Data;

@Data
public class CreateBuildingCostDto {

    private String type;

    private Double cost;
}
