package ru.bunkov.calculation.api.external.equipment;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.equipment.dto.CreateEquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.EquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.SearchEquipmentDto;
import ru.bunkov.calculation.api.external.equipment.mapper.EquipmentMapper;
import ru.bunkov.calculation.service.equipment.EquipmentService;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;

    @GetMapping("list")
    public List<EquipmentDto> getList(SearchEquipmentDto dto,
                                      @SortDefault(value = {"equipmentType"}, direction = Sort.Direction.ASC)
                                      Sort sort) {
        SearchEquipmentArgument argument = EquipmentMapper.EQUIPMENT_MAPPER.toSearchArgument(dto);

        return equipmentService.getList(argument, sort).stream()
                               .map(EquipmentMapper.EQUIPMENT_MAPPER::toDto)
                               .collect(Collectors.toList());
    }

    @PostMapping("create")
    public EquipmentDto create(@RequestBody CreateEquipmentDto dto) {
        CreateEquipmentArgument argument = EquipmentMapper.EQUIPMENT_MAPPER.toCreateArgument(dto);

        return EquipmentMapper.EQUIPMENT_MAPPER.toDto(equipmentService.create(argument));
    }
}
