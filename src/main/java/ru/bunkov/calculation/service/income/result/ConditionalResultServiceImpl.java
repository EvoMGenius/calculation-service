package ru.bunkov.calculation.service.income.result;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.model.income.QConditionalResult;
import ru.bunkov.calculation.repository.ConditionalResultRepository;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;
import ru.bunkov.calculation.service.income.result.argument.SearchConditionalResultArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConditionalResultServiceImpl implements ConditionalResultService {

    private final ConditionalResultRepository repository;

    private final QConditionalResult qConditionalResult = QConditionalResult.conditionalResult;

    @Override
    public ConditionalResult getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<ConditionalResult> getList(SearchConditionalResultArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    public ConditionalResult create(CreateConditionalResultArgument argument) {
        return repository.save(ConditionalResult.builder()
                                                .conditionDescription(argument.getConditionDescription())
                                                .rate(argument.getRate())
                                                .potentialAnnualIncome(argument.getPotentialAnnualIncome())
                                                .totalPotentCost(argument.getTotalPotentCost())
                                                .build());
    }

    private Predicate buildPredicate(SearchConditionalResultArgument argument) {
        return QPredicates.builder()
                          .add(argument.getConditionDescription(), qConditionalResult.conditionDescription::containsIgnoreCase)
                          .add(argument.getRate(), qConditionalResult.rate::eq)
                          .add(argument.getPotentialAnnualIncome(), qConditionalResult.potentialAnnualIncome::eq)
                          .add(argument.getTotalPotentCost(), qConditionalResult.totalPotentCost::eq)
                          .buildAnd();
    }
}
