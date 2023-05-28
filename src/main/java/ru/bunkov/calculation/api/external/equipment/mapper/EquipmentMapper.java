package ru.bunkov.calculation.api.external.equipment.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.external.equipment.dto.CreateEquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.EquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.SearchEquipmentDto;
import ru.bunkov.calculation.model.Equipment;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;

@Mapper
public interface EquipmentMapper {

    EquipmentMapper EQUIPMENT_MAPPER = Mappers.getMapper(EquipmentMapper.class);

    SearchEquipmentArgument toSearchArgument(SearchEquipmentDto dto);

    EquipmentDto toDto(Equipment equipment);

    CreateEquipmentArgument toCreateArgument(CreateEquipmentDto dto);
}
