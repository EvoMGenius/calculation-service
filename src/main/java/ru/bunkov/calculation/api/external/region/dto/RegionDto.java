package ru.bunkov.calculation.api.external.region.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class RegionDto {
    private UUID id;

    private String name;

    private BigDecimal purchaseLand;

    private BigDecimal landLease;

    private BigDecimal rentRoomMin;

    private BigDecimal rentRoomMax;
}
