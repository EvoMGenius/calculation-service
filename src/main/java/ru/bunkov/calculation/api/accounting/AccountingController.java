package ru.bunkov.calculation.api.accounting;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.api.accounting.dto.AccountingDto;
import ru.bunkov.calculation.api.accounting.dto.CreateAccountingDto;
import ru.bunkov.calculation.api.accounting.dto.SearchAccountingDto;
import ru.bunkov.calculation.service.accounting.AccountingService;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.accounting.mapper.AccountingMapper.ACCOUNTING_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/accounting")
public class AccountingController {

    private final AccountingService accountingService;

    @GetMapping("list")
    public List<AccountingDto> getList(SearchAccountingDto dto,
                                       @SortDefault(value = {"organizationalAndLegalForm"}, direction = Sort.Direction.ASC)
                                       Sort sort) {
        SearchAccountingArgument argument = ACCOUNTING_MAPPER.toSearchArgument(dto);
        return accountingService.getList(argument, sort).stream()
                                .map(ACCOUNTING_MAPPER::toDto)
                                .collect(Collectors.toList());
    }

    @PostMapping("create")
    public AccountingDto create(@RequestBody CreateAccountingDto dto) {
        CreateAccountingArgument argument = ACCOUNTING_MAPPER.toCreateArgument(dto);
        return ACCOUNTING_MAPPER.toDto(accountingService.create(argument));
    }

}
