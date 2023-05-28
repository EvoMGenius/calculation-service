package ru.bunkov.calculation.service.calculation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.calculation.Calculation;
import ru.bunkov.calculation.repository.CalculationRepository;
import ru.bunkov.calculation.service.calculation.argument.CreateCalculationArgument;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CalculationServiceImpl implements CalculationService {

    private final CalculationRepository repository;

    @Override
    public Calculation getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Calculation create(CreateCalculationArgument argument) {
        return repository.save(Calculation.builder()
                                          .capitalInvestments(argument.getCapitalInvestments())
                                          .costsOfOpeningProduction(argument.getCostsOfOpeningProduction())
                                          .expenses(argument.getExpenses())
                                          .accountingCost(argument.getAccountingCost())
                                          .totalCostMaxOfAll(argument.getTotalCostMaxOfAll())
                                          .totalCostMinOfAll(argument.getTotalCostMinOfAll())
                                          .build());
    }
}
