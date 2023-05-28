package ru.bunkov.calculation.api.external.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.external.accounting.dto.AccountingDto;
import ru.bunkov.calculation.api.external.accounting.dto.CreateAccountingDto;
import ru.bunkov.calculation.api.external.accounting.dto.SearchAccountingDto;
import ru.bunkov.calculation.api.external.accounting.mapper.AccountingMapper;
import ru.bunkov.calculation.service.accounting.AccountingService;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/accounting")
public class AccountingController {

    private final AccountingService accountingService;

    @GetMapping("list")
    public List<AccountingDto> getList(SearchAccountingDto dto,
                                       @SortDefault(value = {"organizationalAndLegalForm"}, direction = Sort.Direction.ASC)
                                       Sort sort) {
        SearchAccountingArgument argument = AccountingMapper.ACCOUNTING_MAPPER.toSearchArgument(dto);
        return accountingService.getList(argument, sort).stream()
                                .map(AccountingMapper.ACCOUNTING_MAPPER::toDto)
                                .collect(Collectors.toList());
    }

    @PostMapping("create")
    public AccountingDto create(@RequestBody CreateAccountingDto dto) {
        CreateAccountingArgument argument = AccountingMapper.ACCOUNTING_MAPPER.toCreateArgument(dto);
        return AccountingMapper.ACCOUNTING_MAPPER.toDto(accountingService.create(argument));
    }

}
