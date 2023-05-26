package ru.bunkov.calculation.api.income.result.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.income.result.dto.ConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.SearchConditionalResultDto;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;
import ru.bunkov.calculation.service.income.result.argument.SearchConditionalResultArgument;

@Mapper
public interface ConditionalResultMapper {

    ConditionalResultMapper CONDITIONAL_RESULT_MAPPER = Mappers.getMapper(ConditionalResultMapper.class);

    SearchConditionalResultArgument toSearchArgument(SearchConditionalResultDto dto);

    ConditionalResultDto toDto(ConditionalResult conditionalResult);

    CreateConditionalResultArgument toCreateArgument(CreateConditionalResultDto dto);
}
