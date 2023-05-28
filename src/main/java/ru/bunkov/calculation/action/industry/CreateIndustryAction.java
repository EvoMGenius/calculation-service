package ru.bunkov.calculation.action.industry;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.IndustryService;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.SubindustryService;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CreateIndustryAction {

    private final IndustryService industryService;

    private final SubindustryService subindustryService;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Industry execute(CreateIndustryActionArgument argument) {
        List<SubindustryDto> subindustrys = argument.getSubindustry();

        List<Subindustry> newSubindustries = subindustrys.stream()
                                                         .map(result -> subindustryService
                                                                 .create(CreateSubindustryArgument.builder()
                                                                                                  .name(result.getName())
                                                                                                  .averageEmployeeCount2020(result.getAverageEmployeeCount2020())
                                                                                                  .averageEmployeeCount2021(result.getAverageEmployeeCount2021())
                                                                                                  .averageSalary2020(result.getAverageSalary2020())
                                                                                                  .averageSalary2021(result.getAverageSalary2021())
                                                                                                  .incomeTax2021(result.getIncomeTax2021())
                                                                                                  .incomeTax2022(result.getIncomeTax2022())
                                                                                                  .landTax2021(result.getLandTax2021())
                                                                                                  .landTax2022(result.getLandTax2022())
                                                                                                  .propertyTax2021(result.getPropertyTax2021())
                                                                                                  .propertyTax2022(result.getPropertyTax2022())
                                                                                                  .taxToMoscowBudget2021(result.getTaxToMoscowBudget2021())
                                                                                                  .taxToMoscowBudget2022(result.getTaxToMoscowBudget2022())
                                                                                                  .personalIncomeTax2021(result.getPersonalIncomeTax2021())
                                                                                                  .personalIncomeTax2022(result.getPersonalIncomeTax2022())
                                                                                                  .transportTax2021(result.getTransportTax2021())
                                                                                                  .transportTax2022(result.getTransportTax2022())
                                                                                                  .otherTax2021(result.getOtherTax2021())
                                                                                                  .otherTax2022(result.getOtherTax2022())
                                                                                                  .build()))
                                                         .collect(Collectors.toList());

        return industryService.create(CreateIndustryArgument.builder()
                                                            .name(argument.getName())
                                                            .subindustry(newSubindustries)
                                                            .build());
    }

}
