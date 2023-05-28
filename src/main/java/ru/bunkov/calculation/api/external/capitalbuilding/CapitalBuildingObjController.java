package ru.bunkov.calculation.api.external.capitalbuilding;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CreateCapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.SearchCapitalBuildingObjDto;
import ru.bunkov.calculation.service.capitalbuilding.CapitalBuildingObjService;
import ru.bunkov.calculation.service.capitalbuilding.argument.CreateCapitalBuildingObjArgument;
import ru.bunkov.calculation.service.capitalbuilding.argument.SearchCapitalBuildingObjArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.external.capitalbuilding.mapper.CapitalBuildingObjMapper.CAPITAL_BUILDING_OBJ_MAPPER;

@RequestMapping("/api/v1/capital-building")
@RequiredArgsConstructor
@RestController
public class CapitalBuildingObjController {

    private final CapitalBuildingObjService capitalBuildingObjService;

    @GetMapping("list")
    public List<CapitalBuildingObjDto> getList(SearchCapitalBuildingObjDto dto,
                                               @SortDefault(value = {"type"}, direction = Sort.Direction.ASC)
                                               Sort sort) {
        SearchCapitalBuildingObjArgument argument = CAPITAL_BUILDING_OBJ_MAPPER.toSearchArgument(dto);

        return capitalBuildingObjService.getList(argument, sort).stream()
                                        .map(CAPITAL_BUILDING_OBJ_MAPPER::toDto)
                                        .collect(Collectors.toList());
    }

    @PostMapping("create")
    public CapitalBuildingObjDto create(@RequestBody CreateCapitalBuildingObjDto dto) {
        CreateCapitalBuildingObjArgument argument = CAPITAL_BUILDING_OBJ_MAPPER.toCreateArgument(dto);

        return CAPITAL_BUILDING_OBJ_MAPPER.toDto(capitalBuildingObjService.create(argument));
    }
}
