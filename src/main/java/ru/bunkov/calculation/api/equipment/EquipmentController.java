package ru.bunkov.calculation.api.equipment;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.equipment.dto.CreateEquipmentDto;
import ru.bunkov.calculation.api.equipment.dto.EquipmentDto;
import ru.bunkov.calculation.api.equipment.dto.SearchEquipmentDto;
import ru.bunkov.calculation.service.equipment.EquipmentService;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.equipment.mapper.EquipmentMapper.EQUIPMENT_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;

    @GetMapping("list")
    public List<EquipmentDto> getList(SearchEquipmentDto dto,
                                      @SortDefault(value = {"equipmentType"}, direction = Sort.Direction.ASC)
                                      Sort sort) {
        SearchEquipmentArgument argument = EQUIPMENT_MAPPER.toSearchArgument(dto);

        return equipmentService.getList(argument, sort).stream()
                               .map(EQUIPMENT_MAPPER::toDto)
                               .collect(Collectors.toList());
    }

    @PostMapping("create")
    public EquipmentDto create(@RequestBody CreateEquipmentDto dto) {
        CreateEquipmentArgument argument = EQUIPMENT_MAPPER.toCreateArgument(dto);

        return EQUIPMENT_MAPPER.toDto(equipmentService.create(argument));
    }
}
