package ru.bunkov.calculation.api.income.result;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.income.result.dto.ConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.SearchConditionalResultDto;
import ru.bunkov.calculation.service.income.result.ConditionalResultService;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;
import ru.bunkov.calculation.service.income.result.argument.SearchConditionalResultArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.income.result.mapper.ConditionalResultMapper.CONDITIONAL_RESULT_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/conditional-result")
public class ConditionalResultController {

    private final ConditionalResultService conditionalResultService;

    @GetMapping("list")
    public List<ConditionalResultDto> getList(SearchConditionalResultDto dto,
                                              @SortDefault(value = {"conditionDescription"}, direction = Sort.Direction.ASC)
                                              Sort sort) {
        SearchConditionalResultArgument argument = CONDITIONAL_RESULT_MAPPER.toSearchArgument(dto);

        return conditionalResultService.getList(argument, sort).stream()
                                       .map(CONDITIONAL_RESULT_MAPPER::toDto)
                                       .collect(Collectors.toList());
    }

    @PostMapping("create")
    public ConditionalResultDto create(@RequestBody CreateConditionalResultDto dto) {
        CreateConditionalResultArgument argument = CONDITIONAL_RESULT_MAPPER.toCreateArgument(dto);

        return CONDITIONAL_RESULT_MAPPER.toDto(conditionalResultService.create(argument));
    }
}
