package ru.bunkov.calculation.api.external.capitalbuilding.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateCapitalBuildingObjDto {

    private String type;

    private BigDecimal cost;
}
