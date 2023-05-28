package ru.bunkov.calculation.api.external.region.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class RegionDto {
    private UUID id;

    private String name;

    private Double purchaseLand;

    private Double landLease;

    private Double rentRoomMin;

    private Double rentRoomMax;
}
