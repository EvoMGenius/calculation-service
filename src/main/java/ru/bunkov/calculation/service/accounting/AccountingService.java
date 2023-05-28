package ru.bunkov.calculation.service.accounting;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.accounting.Form;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

import java.util.List;
import java.util.UUID;

public interface AccountingService {

    Accounting getExisting(UUID id);

    List<Accounting> getList(SearchAccountingArgument argument, Sort sort);

    Accounting create(CreateAccountingArgument argument);

    Accounting getByForm(Form f);
}
