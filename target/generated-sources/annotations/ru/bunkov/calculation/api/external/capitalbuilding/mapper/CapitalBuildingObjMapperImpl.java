package ru.bunkov.calculation.api.external.capitalbuilding.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.CreateCapitalBuildingObjDto;
import ru.bunkov.calculation.api.external.capitalbuilding.dto.SearchCapitalBuildingObjDto;
import ru.bunkov.calculation.model.CapitalBuildingObj;
import ru.bunkov.calculation.service.capitalbuilding.argument.CreateCapitalBuildingObjArgument;
import ru.bunkov.calculation.service.capitalbuilding.argument.SearchCapitalBuildingObjArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T05:58:32+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class CapitalBuildingObjMapperImpl implements CapitalBuildingObjMapper {

    @Override
    public SearchCapitalBuildingObjArgument toSearchArgument(SearchCapitalBuildingObjDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchCapitalBuildingObjArgument.SearchCapitalBuildingObjArgumentBuilder searchCapitalBuildingObjArgument = SearchCapitalBuildingObjArgument.builder();

        searchCapitalBuildingObjArgument.type( dto.getType() );
        searchCapitalBuildingObjArgument.cost( dto.getCost() );

        return searchCapitalBuildingObjArgument.build();
    }

    @Override
    public CapitalBuildingObjDto toDto(CapitalBuildingObj accounting) {
        if ( accounting == null ) {
            return null;
        }

        CapitalBuildingObjDto capitalBuildingObjDto = new CapitalBuildingObjDto();

        capitalBuildingObjDto.setId( accounting.getId() );
        capitalBuildingObjDto.setType( accounting.getType() );
        capitalBuildingObjDto.setCost( accounting.getCost() );

        return capitalBuildingObjDto;
    }

    @Override
    public CreateCapitalBuildingObjArgument toCreateArgument(CreateCapitalBuildingObjDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateCapitalBuildingObjArgument.CreateCapitalBuildingObjArgumentBuilder createCapitalBuildingObjArgument = CreateCapitalBuildingObjArgument.builder();

        createCapitalBuildingObjArgument.type( dto.getType() );
        createCapitalBuildingObjArgument.cost( dto.getCost() );

        return createCapitalBuildingObjArgument.build();
    }
}
