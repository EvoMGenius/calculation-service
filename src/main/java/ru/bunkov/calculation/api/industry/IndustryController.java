package ru.bunkov.calculation.api.industry;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.action.industry.CreateIndustryAction;
import ru.bunkov.calculation.action.industry.CreateIndustryActionArgument;
import ru.bunkov.calculation.api.industry.dto.CreateIndustryDto;
import ru.bunkov.calculation.api.industry.dto.IndustryDto;
import ru.bunkov.calculation.api.industry.dto.SearchIndustryDto;
import ru.bunkov.calculation.service.industry.IndustryService;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.industry.mapper.IndustryMapper.INDUSTRY_MAPPER;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/industry")
public class IndustryController {

    private final IndustryService industryService;

    private final CreateIndustryAction createIndustryAction;

    @GetMapping("list")
    public List<IndustryDto> getList(SearchIndustryDto dto,
                                     @SortDefault(value = {"name"}, direction = Sort.Direction.ASC)
                                     Sort sort) {
        SearchIndustryArgument argument = INDUSTRY_MAPPER.toSearchArgument(dto);

        return industryService.getList(argument, sort).stream()
                              .map(INDUSTRY_MAPPER::toDto)
                              .collect(Collectors.toList());
    }

    @PostMapping("create")
    public IndustryDto create(@RequestBody CreateIndustryDto dto) {
        CreateIndustryActionArgument argument = INDUSTRY_MAPPER.toCreateActionArgument(dto);

        return INDUSTRY_MAPPER.toDto(createIndustryAction.execute(argument));
    }
}
