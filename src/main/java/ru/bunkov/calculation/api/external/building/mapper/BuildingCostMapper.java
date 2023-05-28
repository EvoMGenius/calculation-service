package ru.bunkov.calculation.api.external.building.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.external.building.dto.BuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.CreateBuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.SearchBuildingCostDto;
import ru.bunkov.calculation.model.BuildingCost;
import ru.bunkov.calculation.service.building.argument.CreateBuildingCostArgument;
import ru.bunkov.calculation.service.building.argument.SearchBuildingCostArgument;

@Mapper
public interface BuildingCostMapper {
    BuildingCostMapper BUILDING_COST_MAPPER = Mappers.getMapper(BuildingCostMapper.class);

    SearchBuildingCostArgument toSearchArgument(SearchBuildingCostDto dto);

    BuildingCostDto toDto(BuildingCost accounting);

    CreateBuildingCostArgument toCreateArgument(CreateBuildingCostDto dto);
}
