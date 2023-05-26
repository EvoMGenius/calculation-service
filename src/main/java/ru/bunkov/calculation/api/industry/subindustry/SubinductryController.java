package ru.bunkov.calculation.api.industry.subindustry;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.industry.subindustry.dto.CreateSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SearchSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.service.industry.subindustry.SubindustryService;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.industry.subindustry.mapper.SubIndustryMapper.SUB_INDUSTRY_MAPPER;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/subindustry")
public class SubinductryController {

    private final SubindustryService subindustryService;

    @GetMapping("list")
    public List<SubindustryDto> getList(SearchSubindustryDto dto,
                                        @SortDefault(value = {"name"}, direction = Sort.Direction.ASC)
                                        Sort sort) {
        SearchSubindustryArgument argument = SUB_INDUSTRY_MAPPER.toSearchArgument(dto);

        return subindustryService.getList(argument, sort).stream()
                                 .map(SUB_INDUSTRY_MAPPER::toDto)
                                 .collect(Collectors.toList());
    }

    @PostMapping("create")
    public SubindustryDto create(@RequestBody CreateSubindustryDto dto) {
        CreateSubindustryArgument argument = SUB_INDUSTRY_MAPPER.toCreateArgument(dto);

        return SUB_INDUSTRY_MAPPER.toDto(subindustryService.create(argument));
    }
}
