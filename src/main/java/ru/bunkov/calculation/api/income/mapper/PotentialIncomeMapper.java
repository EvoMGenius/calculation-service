package ru.bunkov.calculation.api.income.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.action.income.CreatePotentialIncomeActionArgument;
import ru.bunkov.calculation.api.income.dto.CreatePotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.PotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.SearchPotentialIncomeDto;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

@Mapper
public interface PotentialIncomeMapper {

    PotentialIncomeMapper POTENTIAL_INCOME_MAPPER = Mappers.getMapper(PotentialIncomeMapper.class);

    SearchPotentialIncomeArgument toSearchArgument(SearchPotentialIncomeDto dto);

    PotentialIncomeDto toDto(PotentialIncome potentialIncome);

    CreatePotentialIncomeArgument toCreateArgument(CreatePotentialIncomeDto dto);

    CreatePotentialIncomeActionArgument toCreateActionArgument(CreatePotentialIncomeDto dto);
}
