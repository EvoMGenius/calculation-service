package ru.bunkov.calculation.action.income;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.service.income.PotentialIncomeService;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.result.ConditionalResultService;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CreatePotentialIncomeAction {

    private final PotentialIncomeService potentialIncomeService;

    private final ConditionalResultService conditionalResultService;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public PotentialIncome execute(CreatePotentialIncomeActionArgument argument) {
        List<CreateConditionalResultDto> results = argument.getResult();

        List<ConditionalResult> currentResults = results.stream()
                                                        .map(result -> conditionalResultService
                                                                .create(CreateConditionalResultArgument.builder()
                                                                                                       .rate(result.getRate())
                                                                                                       .potentialAnnualIncome(result.getPotentialAnnualIncome())
                                                                                                       .conditionDescription(result.getConditionDescription())
                                                                                                       .totalPotentCost(result.getTotalPotentCost())
                                                                                                       .build()))
                                                        .collect(Collectors.toList());

        return potentialIncomeService.create(CreatePotentialIncomeArgument.builder()
                                                                          .typeOfBusiness(argument.getTypeOfBusiness())
                                                                          .result(currentResults)
                                                                          .build());
    }
}
