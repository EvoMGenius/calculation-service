package ru.bunkov.calculation.api.external.region.dto;

import lombok.Data;

@Data
public class CreateRegionDto {

    private String name;

    private Double purchaseLand;

    private Double landLease;

    private Double rentRoomMin;

    private Double rentRoomMax;
}