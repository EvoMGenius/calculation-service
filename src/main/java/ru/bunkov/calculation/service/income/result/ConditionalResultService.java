package ru.bunkov.calculation.service.income.result;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;
import ru.bunkov.calculation.service.income.result.argument.SearchConditionalResultArgument;

import java.util.List;
import java.util.UUID;

public interface ConditionalResultService {

    ConditionalResult getExisting(UUID id);

    List<ConditionalResult> getList(SearchConditionalResultArgument argument, Sort sort);

    ConditionalResult create(CreateConditionalResultArgument argument);
}
