package ru.bunkov.calculation.api.external.industry;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.action.industry.CreateIndustryAction;
import ru.bunkov.calculation.action.industry.CreateIndustryActionArgument;
import ru.bunkov.calculation.api.external.industry.dto.SearchIndustryDto;
import ru.bunkov.calculation.api.external.industry.mapper.IndustryMapper;
import ru.bunkov.calculation.api.external.industry.dto.CreateIndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.IndustryDto;
import ru.bunkov.calculation.service.industry.IndustryService;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

import java.util.List;
import java.util.stream.Collectors;


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
        SearchIndustryArgument argument = IndustryMapper.INDUSTRY_MAPPER.toSearchArgument(dto);

        return industryService.getList(argument, sort).stream()
                              .map(IndustryMapper.INDUSTRY_MAPPER::toDto)
                              .collect(Collectors.toList());
    }

    @PostMapping("create")
    public IndustryDto create(@RequestBody CreateIndustryDto dto) {
        CreateIndustryActionArgument argument = IndustryMapper.INDUSTRY_MAPPER.toCreateActionArgument(dto);

        return IndustryMapper.INDUSTRY_MAPPER.toDto(createIndustryAction.execute(argument));
    }
}
