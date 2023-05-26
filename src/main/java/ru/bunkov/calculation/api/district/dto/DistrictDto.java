package ru.bunkov.calculation.api.district.dto;

import lombok.Data;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;

import java.util.List;
import java.util.UUID;

@Data
public class DistrictDto {

    private UUID id;

    private String district;

    private List<RegionDto> regions;

    private Double averageCost;
}
