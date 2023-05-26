package ru.bunkov.calculation.service.income;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

import java.util.List;
import java.util.UUID;

public interface PotentialIncomeService {

    PotentialIncome getExisting(UUID id);

    List<PotentialIncome> getList(SearchPotentialIncomeArgument argument, Sort sort);

    PotentialIncome create(CreatePotentialIncomeArgument argument);
}
