package ru.bunkov.calculation.api.external.region.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.external.region.dto.CreateRegionDto;
import ru.bunkov.calculation.api.external.region.dto.RegionDto;
import ru.bunkov.calculation.api.external.region.dto.SearchRegionDto;
import ru.bunkov.calculation.model.region.Region;
import ru.bunkov.calculation.service.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.region.argument.SearchRegionArgument;

@Mapper
public interface RegionMapper {

    RegionMapper REGION_MAPPER = Mappers.getMapper(RegionMapper.class);

    SearchRegionArgument toSearchArgument(SearchRegionDto dto);

    RegionDto toDto(Region region);

    CreateRegionArgument toCreateArgument(CreateRegionDto dto);
}
