package ru.bunkov.calculation.api.external.equipment.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.equipment.dto.CreateEquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.EquipmentDto;
import ru.bunkov.calculation.api.external.equipment.dto.SearchEquipmentDto;
import ru.bunkov.calculation.model.Equipment;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T06:54:41+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class EquipmentMapperImpl implements EquipmentMapper {

    @Override
    public SearchEquipmentArgument toSearchArgument(SearchEquipmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchEquipmentArgument.SearchEquipmentArgumentBuilder searchEquipmentArgument = SearchEquipmentArgument.builder();

        searchEquipmentArgument.equipmentType( dto.getEquipmentType() );
        searchEquipmentArgument.averageCost( dto.getAverageCost() );

        return searchEquipmentArgument.build();
    }

    @Override
    public EquipmentDto toDto(Equipment equipment) {
        if ( equipment == null ) {
            return null;
        }

        EquipmentDto equipmentDto = new EquipmentDto();

        equipmentDto.setId( equipment.getId() );
        equipmentDto.setEquipmentType( equipment.getEquipmentType() );
        equipmentDto.setAverageCost( equipment.getAverageCost() );

        return equipmentDto;
    }

    @Override
    public CreateEquipmentArgument toCreateArgument(CreateEquipmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateEquipmentArgument.CreateEquipmentArgumentBuilder createEquipmentArgument = CreateEquipmentArgument.builder();

        createEquipmentArgument.equipmentType( dto.getEquipmentType() );
        createEquipmentArgument.averageCost( dto.getAverageCost() );

        return createEquipmentArgument.build();
    }
}
