package ru.bunkov.calculation.api.income;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.action.income.CreatePotentialIncomeAction;
import ru.bunkov.calculation.action.income.CreatePotentialIncomeActionArgument;
import ru.bunkov.calculation.api.income.dto.CreatePotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.PotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.SearchPotentialIncomeDto;
import ru.bunkov.calculation.service.income.PotentialIncomeService;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.income.mapper.PotentialIncomeMapper.POTENTIAL_INCOME_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/potential-income")
public class PotentialIncomeController {

    private final PotentialIncomeService potentialIncomeService;

    private final CreatePotentialIncomeAction createPotentialIncomeAction;

    @GetMapping("list")
    public List<PotentialIncomeDto> getList(SearchPotentialIncomeDto dto,
                                            @SortDefault(value = {"typeOfBusiness"}, direction = Sort.Direction.ASC)
                                            Sort sort) {
        SearchPotentialIncomeArgument argument = POTENTIAL_INCOME_MAPPER.toSearchArgument(dto);

        return potentialIncomeService.getList(argument, sort).stream()
                                     .map(POTENTIAL_INCOME_MAPPER::toDto)
                                     .collect(Collectors.toList());
    }

    @PostMapping("create")
    public PotentialIncomeDto create(@RequestBody CreatePotentialIncomeDto dto) {
        CreatePotentialIncomeActionArgument argument = POTENTIAL_INCOME_MAPPER.toCreateActionArgument(dto);

        return POTENTIAL_INCOME_MAPPER.toDto(createPotentialIncomeAction.execute(argument));
    }
}
