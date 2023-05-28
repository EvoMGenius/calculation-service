package ru.bunkov.calculation.api.external.region;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.region.dto.CreateRegionDto;
import ru.bunkov.calculation.api.external.region.dto.RegionDto;
import ru.bunkov.calculation.api.external.region.dto.SearchRegionDto;
import ru.bunkov.calculation.service.region.RegionService;
import ru.bunkov.calculation.service.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.region.argument.SearchRegionArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.external.region.mapper.RegionMapper.REGION_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/region")
public class RegionController {

    private final RegionService regionService;

    @GetMapping("list")
    public List<RegionDto> getList(SearchRegionDto dto,
                                   @SortDefault(value = {"name"}, direction = Sort.Direction.ASC)
                                   Sort sort) {
        SearchRegionArgument argument = REGION_MAPPER.toSearchArgument(dto);

        return regionService.getList(argument, sort).stream()
                            .map(REGION_MAPPER::toDto)
                            .collect(Collectors.toList());
    }

    @PostMapping("create")
    public RegionDto create(@RequestBody CreateRegionDto dto) {
        CreateRegionArgument argument = REGION_MAPPER.toCreateArgument(dto);

        return REGION_MAPPER.toDto(regionService.create(argument));
    }
}
