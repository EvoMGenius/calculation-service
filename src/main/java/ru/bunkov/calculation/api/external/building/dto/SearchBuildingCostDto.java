package ru.bunkov.calculation.api.external.building.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SearchBuildingCostDto {

    private String type;

    private BigDecimal cost;

}
