package ru.bunkov.calculation.api.external.region.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRegionDto {

    private String name;

    private BigDecimal purchaseLand;

    private BigDecimal landLease;

    private BigDecimal rentRoomMin;

    private BigDecimal rentRoomMax;
}
