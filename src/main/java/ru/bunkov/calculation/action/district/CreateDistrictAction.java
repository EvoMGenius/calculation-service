package ru.bunkov.calculation.action.district;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;
import ru.bunkov.calculation.model.district.District;
import ru.bunkov.calculation.model.district.Region;
import ru.bunkov.calculation.service.district.DistrictService;
import ru.bunkov.calculation.service.district.argument.CreateDistrictArgument;
import ru.bunkov.calculation.service.district.region.RegionService;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CreateDistrictAction {

    private final DistrictService districtService;

    private final RegionService regionService;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public District execute(CreateDistrictActionArgument argument) {
        List<RegionDto> regions = argument.getRegions();

        List<Region> currentRegions = regions.stream()
                                             .map(regionDto -> regionService.getExisting(regionDto.getId()))
                                             .collect(Collectors.toList());

        return districtService.create(CreateDistrictArgument.builder()
                                                            .district(argument.getDistrict())
                                                            .averageCost(argument.getAverageCost())
                                                            .regions(currentRegions)
                                                            .build());
    }
}
