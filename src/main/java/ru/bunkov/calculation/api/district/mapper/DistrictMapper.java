package ru.bunkov.calculation.api.district.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.action.district.CreateDistrictActionArgument;
import ru.bunkov.calculation.api.district.dto.CreateDistrictDto;
import ru.bunkov.calculation.api.district.dto.DistrictDto;
import ru.bunkov.calculation.api.district.dto.SearchDistrictDto;
import ru.bunkov.calculation.model.district.District;
import ru.bunkov.calculation.service.district.argument.CreateDistrictArgument;
import ru.bunkov.calculation.service.district.argument.SearchDistrictArgument;

@Mapper
public interface DistrictMapper {

    DistrictMapper DISTRICT_MAPPER = Mappers.getMapper(DistrictMapper.class);

    SearchDistrictArgument toSearchArgument(SearchDistrictDto dto);

    DistrictDto toDto(District district);

    CreateDistrictArgument toCreateArgument(CreateDistrictDto dto);

    CreateDistrictActionArgument toCreateActionArgument(CreateDistrictDto dto);
}
