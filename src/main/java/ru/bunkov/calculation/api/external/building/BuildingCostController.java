package ru.bunkov.calculation.api.external.building;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.building.dto.BuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.CreateBuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.SearchBuildingCostDto;
import ru.bunkov.calculation.service.building.BuildingCostService;
import ru.bunkov.calculation.service.building.argument.CreateBuildingCostArgument;
import ru.bunkov.calculation.service.building.argument.SearchBuildingCostArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.external.building.mapper.BuildingCostMapper.BUILDING_COST_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/building")
public class BuildingCostController {

    private final BuildingCostService buildingCostService;

    @GetMapping("list")
    public List<BuildingCostDto> getList(SearchBuildingCostDto dto,
                                         @SortDefault(value = {"type"}, direction = Sort.Direction.ASC)
                                         Sort sort) {
        SearchBuildingCostArgument argument = BUILDING_COST_MAPPER.toSearchArgument(dto);

        return buildingCostService.getList(argument, sort).stream()
                                  .map(BUILDING_COST_MAPPER::toDto)
                                  .collect(Collectors.toList());
    }

    @PostMapping("create")
    public BuildingCostDto create(@RequestBody CreateBuildingCostDto dto) {
        CreateBuildingCostArgument argument = BUILDING_COST_MAPPER.toCreateArgument(dto);

        return BUILDING_COST_MAPPER.toDto(buildingCostService.create(argument));
    }
}
