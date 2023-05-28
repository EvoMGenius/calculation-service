package ru.bunkov.calculation.api.external.capitalbuilding.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CreateCapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.SearchCapitalBuildingObjDto;
import ru.bunkov.calculation.model.CapitalBuildingObj;
import ru.bunkov.calculation.service.capitalbuilding.argument.CreateCapitalBuildingObjArgument;
import ru.bunkov.calculation.service.capitalbuilding.argument.SearchCapitalBuildingObjArgument;

@Mapper
public interface CapitalBuildingObjMapper {

    CapitalBuildingObjMapper CAPITAL_BUILDING_OBJ_MAPPER = Mappers.getMapper(CapitalBuildingObjMapper.class);

    SearchCapitalBuildingObjArgument toSearchArgument(SearchCapitalBuildingObjDto dto);

    CapitalBuildingObjDto toDto(CapitalBuildingObj accounting);

    CreateCapitalBuildingObjArgument toCreateArgument(CreateCapitalBuildingObjDto dto);
}
