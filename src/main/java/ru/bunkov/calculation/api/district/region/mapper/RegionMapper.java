package ru.bunkov.calculation.api.district.region.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.district.region.dto.CreateRegionDto;
import ru.bunkov.calculation.api.district.region.dto.RegionDto;
import ru.bunkov.calculation.api.district.region.dto.SearchRegionDto;
import ru.bunkov.calculation.model.district.Region;
import ru.bunkov.calculation.service.district.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.district.region.argument.SearchRegionArgument;

@Mapper
public interface RegionMapper {

    RegionMapper REGION_MAPPER = Mappers.getMapper(RegionMapper.class);

    SearchRegionArgument toSearchArgument(SearchRegionDto dto);

    RegionDto toDto(Region region);

    CreateRegionArgument toCreateArgument(CreateRegionDto dto);
}
