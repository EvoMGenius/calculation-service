package ru.bunkov.calculation.api.district.region.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class RegionDto {
    private UUID id;

    private String name;

    private Double rent;
}
