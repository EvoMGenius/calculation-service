package ru.bunkov.calculation.api.external.region.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.region.dto.CreateRegionDto;
import ru.bunkov.calculation.api.external.region.dto.RegionDto;
import ru.bunkov.calculation.api.external.region.dto.SearchRegionDto;
import ru.bunkov.calculation.model.region.Region;
import ru.bunkov.calculation.service.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.region.argument.SearchRegionArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T05:58:33+1000",
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
        searchRegionArgument.purchaseLand( dto.getPurchaseLand() );
        searchRegionArgument.landLease( dto.getLandLease() );
        searchRegionArgument.rentRoomMin( dto.getRentRoomMin() );
        searchRegionArgument.rentRoomMax( dto.getRentRoomMax() );

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
        regionDto.setPurchaseLand( region.getPurchaseLand() );
        regionDto.setLandLease( region.getLandLease() );
        regionDto.setRentRoomMin( region.getRentRoomMin() );
        regionDto.setRentRoomMax( region.getRentRoomMax() );

        return regionDto;
    }

    @Override
    public CreateRegionArgument toCreateArgument(CreateRegionDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateRegionArgument.CreateRegionArgumentBuilder createRegionArgument = CreateRegionArgument.builder();

        createRegionArgument.name( dto.getName() );
        createRegionArgument.purchaseLand( dto.getPurchaseLand() );
        createRegionArgument.landLease( dto.getLandLease() );
        createRegionArgument.rentRoomMin( dto.getRentRoomMin() );
        createRegionArgument.rentRoomMax( dto.getRentRoomMax() );

        return createRegionArgument.build();
    }
}
