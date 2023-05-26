package ru.bunkov.calculation.api.district.dto;

import lombok.Data;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;

import java.util.List;

@Data
public class CreateDistrictDto {

    private String district;

    private List<RegionDto> regions;

    private Double averageCost;
}
