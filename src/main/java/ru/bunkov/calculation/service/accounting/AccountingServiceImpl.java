package ru.bunkov.calculation.service.accounting;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.accounting.QAccounting;
import ru.bunkov.calculation.repository.AccountingRepository;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountingServiceImpl implements AccountingService {

    private final AccountingRepository repository;

    private final QAccounting qAccounting = QAccounting.accounting;

    @Override
    @Transactional(readOnly = true)
    public Accounting getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Accounting> getList(SearchAccountingArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Accounting create(CreateAccountingArgument argument) {
        return repository.save(Accounting.builder()
                                         .organizationalAndLegalForm(argument.getOrganizationalAndLegalForm())
                                         .simplifiedTaxationSystemMax(argument.getSimplifiedTaxationSystemMax())
                                         .simplifiedTaxationSystemMin(argument.getSimplifiedTaxationSystemMin())
                                         .generalTaxationSystemMin(argument.getGeneralTaxationSystemMin())
                                         .generalTaxationSystemMax(argument.getGeneralTaxationSystemMax())
                                         .patentMin(argument.getPatentMin())
                                         .patentMax(argument.getPatentMax())
                                         .build());
    }

    private Predicate buildPredicate(SearchAccountingArgument argument) {
        return QPredicates.builder()
                          .add(argument.getOrganizationalAndLegalForm(), qAccounting.organizationalAndLegalForm::eq)
                          .buildAnd();
    }
}
