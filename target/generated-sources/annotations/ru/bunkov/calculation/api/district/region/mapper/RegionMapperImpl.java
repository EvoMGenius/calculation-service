package ru.bunkov.calculation.api.district.region.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.district.region.dto.CreateRegionDto;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;
import ru.bunkov.calculation.api.district.region.dto.SearchRegionDto;
import ru.bunkov.calculation.model.district.Region;
import ru.bunkov.calculation.service.district.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.district.region.argument.SearchRegionArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:23+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class RegionMapperImpl implements RegionMapper {

    @Override
    public SearchRegionArgument toSearchArgument(SearchRegionDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchRegionArgument.SearchRegionArgumentBuilder searchRegionArgument = SearchRegionArgument.builder();

        searchRegionArgument.name( dto.getName() );
        searchRegionArgument.rent( dto.getRent() );

        return searchRegionArgument.build();
    }

    @Override
    public RegionDto toDto(Region region) {
        if ( region == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( region.getId() );
        regionDto.setName( region.getName() );
        regionDto.setRent( region.getRent() );

        return regionDto;
    }

    @Override
    public CreateRegionArgument toCreateArgument(CreateRegionDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateRegionArgument.CreateRegionArgumentBuilder createRegionArgument = CreateRegionArgument.builder();

        createRegionArgument.name( dto.getName() );
        createRegionArgument.rent( dto.getRent() );

        return createRegionArgument.build();
    }
}
