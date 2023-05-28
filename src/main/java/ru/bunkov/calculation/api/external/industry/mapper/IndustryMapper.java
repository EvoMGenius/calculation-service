package ru.bunkov.calculation.api.external.industry.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.action.industry.CreateIndustryActionArgument;
import ru.bunkov.calculation.api.external.industry.dto.CreateIndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.IndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.SearchIndustryDto;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

@Mapper
public interface IndustryMapper {

    IndustryMapper INDUSTRY_MAPPER = Mappers.getMapper(IndustryMapper.class);

    SearchIndustryArgument toSearchArgument(SearchIndustryDto dto);

    IndustryDto toDto(Industry industry);

    CreateIndustryArgument toCreateArgument(CreateIndustryDto dto);

    CreateIndustryActionArgument toCreateActionArgument(CreateIndustryDto dto);
}
