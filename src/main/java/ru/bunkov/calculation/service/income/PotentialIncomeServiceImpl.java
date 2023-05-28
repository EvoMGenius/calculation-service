package ru.bunkov.calculation.service.income;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.model.income.QPotentialIncome;
import ru.bunkov.calculation.repository.PotentialIncomeRepository;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PotentialIncomeServiceImpl implements PotentialIncomeService {

    private final PotentialIncomeRepository repository;

    private final QPotentialIncome qPotentialIncome = QPotentialIncome.potentialIncome;

    @Override
    public PotentialIncome getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<PotentialIncome> getList(SearchPotentialIncomeArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    public PotentialIncome create(CreatePotentialIncomeArgument argument) {
        return repository.save(PotentialIncome.builder()
                                              .typeOfBusiness(argument.getTypeOfBusiness())
                                              .rate(argument.getRate())
                                              .totalPotentCost(argument.getTotalPotentCost())
                                              .potentialAnnualIncome(argument.getPotentialAnnualIncome())
                                              .build());
    }

    private Predicate buildPredicate(SearchPotentialIncomeArgument argument) {
        return QPredicates.builder()
                          .add(argument.getTypeOfBusiness(), qPotentialIncome.typeOfBusiness::containsIgnoreCase)
                          .add(argument.getPotentialAnnualIncome(), qPotentialIncome.potentialAnnualIncome::eq)
                          .add(argument.getRate(), qPotentialIncome.rate::eq)
                          .add(argument.getTotalPotentCost(), qPotentialIncome.totalPotentCost::eq)
                          .buildAnd();
    }
}
