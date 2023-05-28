package ru.bunkov.calculation.api.external.industry;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.action.industry.CreateIndustryAction;
import ru.bunkov.calculation.action.industry.CreateIndustryActionArgument;
import ru.bunkov.calculation.api.external.industry.dto.CreateIndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.CreateSimpleIndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.IndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.SearchIndustryDto;
import ru.bunkov.calculation.api.external.industry.mapper.IndustryMapper;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.service.industry.IndustryService;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

import java.util.ArrayList;
import java.util.Collections;
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

    @PostMapping("simple-create")
    private IndustryDto simpleCreate(@RequestBody CreateSimpleIndustryDto dto) {
        CreateIndustryActionArgument argument = CreateIndustryActionArgument.builder()
                                                                            .name(dto.getIndustryName())
                                                                            .subindustry(
                                                                                    new ArrayList<>(Collections
                                                                                                            .singletonList(SubindustryDto.builder()
                                                                                                                                         .name(dto.getSubindustryName())
                                                                                                                                         .averageEmployeeCount2020(dto.getAverageEmployeeCount2020())
                                                                                                                                         .averageEmployeeCount2021(dto.getAverageEmployeeCount2021())
                                                                                                                                         .averageSalary2020(dto.getAverageSalary2020())
                                                                                                                                         .averageSalary2021(dto.getAverageSalary2021())
                                                                                                                                         .incomeTax2021(dto.getIncomeTax2021())
                                                                                                                                         .incomeTax2022(dto.getIncomeTax2022())
                                                                                                                                         .landTax2021(dto.getLandTax2021())
                                                                                                                                         .landTax2022(dto.getLandTax2022())
                                                                                                                                         .propertyTax2021(dto.getPropertyTax2021())
                                                                                                                                         .propertyTax2022(dto.getPropertyTax2022())
                                                                                                                                         .taxToMoscowBudget2021(dto.getTaxToMoscowBudget2021())
                                                                                                                                         .taxToMoscowBudget2022(dto.getTaxToMoscowBudget2022())
                                                                                                                                         .personalIncomeTax2021(dto.getPersonalIncomeTax2021())
                                                                                                                                         .personalIncomeTax2022(dto.getPersonalIncomeTax2022())
                                                                                                                                         .transportTax2021(dto.getTransportTax2021())
                                                                                                                                         .transportTax2022(dto.getTransportTax2022())
                                                                                                                                         .otherTax2021(dto.getOtherTax2021())
                                                                                                                                         .otherTax2022(dto.getOtherTax2022())
                                                                                                                                         .taxSumm2021(dto.getTaxSumm2021())
                                                                                                                                         .taxSumm2022(dto.getTaxSumm2022())
                                                                                                                                         .spendOnHiringStaff2020(dto.getSpendOnHiringStaff2020())
                                                                                                                                         .spendOnHiringStaff2021(dto.getSpendOnHiringStaff2021())
                                                                                                                                         .build())))
                                                                            .build();

        return IndustryMapper.INDUSTRY_MAPPER.toDto(createIndustryAction.execute(argument));
    }
}
