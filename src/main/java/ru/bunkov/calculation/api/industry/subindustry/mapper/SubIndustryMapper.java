package ru.bunkov.calculation.api.industry.subindustry.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.industry.subindustry.dto.CreateSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SearchSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;

@Mapper
public interface SubIndustryMapper {

    SubIndustryMapper SUB_INDUSTRY_MAPPER = Mappers.getMapper(SubIndustryMapper.class);

    SearchSubindustryArgument toSearchArgument(SearchSubindustryDto dto);

    SubindustryDto toDto(Subindustry subindustry);

    CreateSubindustryArgument toCreateArgument(CreateSubindustryDto dto);
}
