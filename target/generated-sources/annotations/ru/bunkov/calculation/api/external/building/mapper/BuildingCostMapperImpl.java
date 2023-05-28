package ru.bunkov.calculation.api.external.building.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.building.dto.BuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.CreateBuildingCostDto;
import ru.bunkov.calculation.api.external.building.dto.SearchBuildingCostDto;
import ru.bunkov.calculation.model.BuildingCost;
import ru.bunkov.calculation.service.building.argument.CreateBuildingCostArgument;
import ru.bunkov.calculation.service.building.argument.SearchBuildingCostArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T06:54:41+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class BuildingCostMapperImpl implements BuildingCostMapper {

    @Override
    public SearchBuildingCostArgument toSearchArgument(SearchBuildingCostDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchBuildingCostArgument.SearchBuildingCostArgumentBuilder searchBuildingCostArgument = SearchBuildingCostArgument.builder();

        searchBuildingCostArgument.type( dto.getType() );
        searchBuildingCostArgument.cost( dto.getCost() );

        return searchBuildingCostArgument.build();
    }

    @Override
    public BuildingCostDto toDto(BuildingCost accounting) {
        if ( accounting == null ) {
            return null;
        }

        BuildingCostDto buildingCostDto = new BuildingCostDto();

        buildingCostDto.setId( accounting.getId() );
        buildingCostDto.setType( accounting.getType() );
        buildingCostDto.setCost( accounting.getCost() );

        return buildingCostDto;
    }

    @Override
    public CreateBuildingCostArgument toCreateArgument(CreateBuildingCostDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateBuildingCostArgument.CreateBuildingCostArgumentBuilder createBuildingCostArgument = CreateBuildingCostArgument.builder();

        createBuildingCostArgument.type( dto.getType() );
        createBuildingCostArgument.cost( dto.getCost() );

        return createBuildingCostArgument.build();
    }
}
