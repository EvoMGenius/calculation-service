package ru.bunkov.calculation.api.district.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ru.bunkov.calculation.action.district.CreateDistrictActionArgument;
import ru.bunkov.calculation.api.district.dto.CreateDistrictDto;
import ru.bunkov.calculation.api.district.dto.DistrictDto;
import ru.bunkov.calculation.api.district.dto.SearchDistrictDto;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;
import ru.bunkov.calculation.model.district.District;
import ru.bunkov.calculation.model.district.Region;
import ru.bunkov.calculation.service.district.argument.CreateDistrictArgument;
import ru.bunkov.calculation.service.district.argument.SearchDistrictArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:23+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class DistrictMapperImpl implements DistrictMapper {

    @Override
    public SearchDistrictArgument toSearchArgument(SearchDistrictDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchDistrictArgument.SearchDistrictArgumentBuilder searchDistrictArgument = SearchDistrictArgument.builder();

        searchDistrictArgument.district( dto.getDistrict() );
        searchDistrictArgument.averageCost( dto.getAverageCost() );

        return searchDistrictArgument.build();
    }

    @Override
    public DistrictDto toDto(District district) {
        if ( district == null ) {
            return null;
        }

        DistrictDto districtDto = new DistrictDto();

        districtDto.setId( district.getId() );
        districtDto.setDistrict( district.getDistrict() );
        districtDto.setRegions( regionListToRegionDtoList( district.getRegions() ) );
        districtDto.setAverageCost( district.getAverageCost() );

        return districtDto;
    }

    @Override
    public CreateDistrictArgument toCreateArgument(CreateDistrictDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateDistrictArgument.CreateDistrictArgumentBuilder createDistrictArgument = CreateDistrictArgument.builder();

        createDistrictArgument.district( dto.getDistrict() );
        createDistrictArgument.regions( regionDtoListToRegionList( dto.getRegions() ) );
        createDistrictArgument.averageCost( dto.getAverageCost() );

        return createDistrictArgument.build();
    }

    @Override
    public CreateDistrictActionArgument toCreateActionArgument(CreateDistrictDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateDistrictActionArgument.CreateDistrictActionArgumentBuilder createDistrictActionArgument = CreateDistrictActionArgument.builder();

        createDistrictActionArgument.district( dto.getDistrict() );
        List<RegionDto> list = dto.getRegions();
        if ( list != null ) {
            createDistrictActionArgument.regions( new ArrayList<RegionDto>( list ) );
        }
        createDistrictActionArgument.averageCost( dto.getAverageCost() );

        return createDistrictActionArgument.build();
    }

    protected RegionDto regionToRegionDto(Region region) {
        if ( region == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( region.getId() );
        regionDto.setName( region.getName() );
        regionDto.setRent( region.getRent() );

        return regionDto;
    }

    protected List<RegionDto> regionListToRegionDtoList(List<Region> list) {
        if ( list == null ) {
            return null;
        }

        List<RegionDto> list1 = new ArrayList<RegionDto>( list.size() );
        for ( Region region : list ) {
            list1.add( regionToRegionDto( region ) );
        }

        return list1;
    }

    protected Region regionDtoToRegion(RegionDto regionDto) {
        if ( regionDto == null ) {
            return null;
        }

        Region.RegionBuilder region = Region.builder();

        region.id( regionDto.getId() );
        region.name( regionDto.getName() );
        region.rent( regionDto.getRent() );

        return region.build();
    }

    protected List<Region> regionDtoListToRegionList(List<RegionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Region> list1 = new ArrayList<Region>( list.size() );
        for ( RegionDto regionDto : list ) {
            list1.add( regionDtoToRegion( regionDto ) );
        }

        return list1;
    }
}
