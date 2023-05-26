package ru.bunkov.calculation.api.accounting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.accounting.dto.AccountingDto;
import ru.bunkov.calculation.api.accounting.dto.CreateAccountingDto;
import ru.bunkov.calculation.api.accounting.dto.SearchAccountingDto;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

@Mapper
public interface AccountingMapper {

    AccountingMapper ACCOUNTING_MAPPER = Mappers.getMapper(AccountingMapper.class);

    SearchAccountingArgument toSearchArgument(SearchAccountingDto dto);

    AccountingDto toDto(Accounting accounting);

    CreateAccountingArgument toCreateArgument(CreateAccountingDto dto);
}
