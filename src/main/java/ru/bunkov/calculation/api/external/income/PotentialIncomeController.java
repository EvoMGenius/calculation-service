package ru.bunkov.calculation.api.external.income;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.income.dto.CreatePotentialIncomeDto;
import ru.bunkov.calculation.api.external.income.dto.PotentialIncomeDto;
import ru.bunkov.calculation.api.external.income.dto.SearchPotentialIncomeDto;
import ru.bunkov.calculation.api.external.income.mapper.PotentialIncomeMapper;
import ru.bunkov.calculation.service.income.PotentialIncomeService;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/potential-income")
public class PotentialIncomeController {

    private final PotentialIncomeService potentialIncomeService;

    @GetMapping("list")
    public List<PotentialIncomeDto> getList(SearchPotentialIncomeDto dto,
                                            @SortDefault(value = {"typeOfBusiness"}, direction = Sort.Direction.ASC)
                                            Sort sort) {
        SearchPotentialIncomeArgument argument = PotentialIncomeMapper.POTENTIAL_INCOME_MAPPER.toSearchArgument(dto);

        return potentialIncomeService.getList(argument, sort).stream()
                                     .map(PotentialIncomeMapper.POTENTIAL_INCOME_MAPPER::toDto)
                                     .collect(Collectors.toList());
    }

    @PostMapping("create")
    public PotentialIncomeDto create(@RequestBody CreatePotentialIncomeDto dto) {
        CreatePotentialIncomeArgument argument = PotentialIncomeMapper.POTENTIAL_INCOME_MAPPER.toCreateArgument(dto);

        return PotentialIncomeMapper.POTENTIAL_INCOME_MAPPER.toDto(potentialIncomeService.create(argument));
    }
}
