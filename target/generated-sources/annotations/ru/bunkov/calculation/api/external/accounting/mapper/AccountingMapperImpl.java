package ru.bunkov.calculation.api.external.accounting.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.accounting.dto.AccountingDto;
import ru.bunkov.calculation.api.external.accounting.dto.CreateAccountingDto;
import ru.bunkov.calculation.api.external.accounting.dto.SearchAccountingDto;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-28T06:50:13+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class AccountingMapperImpl implements AccountingMapper {

    @Override
    public SearchAccountingArgument toSearchArgument(SearchAccountingDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchAccountingArgument.SearchAccountingArgumentBuilder searchAccountingArgument = SearchAccountingArgument.builder();

        searchAccountingArgument.organizationalAndLegalForm( dto.getOrganizationalAndLegalForm() );
        searchAccountingArgument.generalTaxationSystemMin( dto.getGeneralTaxationSystemMin() );
        searchAccountingArgument.generalTaxationSystemMax( dto.getGeneralTaxationSystemMax() );
        searchAccountingArgument.simplifiedTaxationSystemMin( dto.getSimplifiedTaxationSystemMin() );
        searchAccountingArgument.simplifiedTaxationSystemMax( dto.getSimplifiedTaxationSystemMax() );
        searchAccountingArgument.patentMin( dto.getPatentMin() );
        searchAccountingArgument.patentMax( dto.getPatentMax() );

        return searchAccountingArgument.build();
    }

    @Override
    public AccountingDto toDto(Accounting accounting) {
        if ( accounting == null ) {
            return null;
        }

        AccountingDto accountingDto = new AccountingDto();

        accountingDto.setId( accounting.getId() );
        accountingDto.setOrganizationalAndLegalForm( accounting.getOrganizationalAndLegalForm() );
        accountingDto.setGeneralTaxationSystemMin( accounting.getGeneralTaxationSystemMin() );
        accountingDto.setGeneralTaxationSystemMax( accounting.getGeneralTaxationSystemMax() );
        accountingDto.setSimplifiedTaxationSystemMin( accounting.getSimplifiedTaxationSystemMin() );
        accountingDto.setSimplifiedTaxationSystemMax( accounting.getSimplifiedTaxationSystemMax() );
        accountingDto.setPatentMin( accounting.getPatentMin() );
        accountingDto.setPatentMax( accounting.getPatentMax() );

        return accountingDto;
    }

    @Override
    public CreateAccountingArgument toCreateArgument(CreateAccountingDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateAccountingArgument.CreateAccountingArgumentBuilder createAccountingArgument = CreateAccountingArgument.builder();

        createAccountingArgument.organizationalAndLegalForm( dto.getOrganizationalAndLegalForm() );
        createAccountingArgument.generalTaxationSystemMin( dto.getGeneralTaxationSystemMin() );
        createAccountingArgument.generalTaxationSystemMax( dto.getGeneralTaxationSystemMax() );
        createAccountingArgument.simplifiedTaxationSystemMin( dto.getSimplifiedTaxationSystemMin() );
        createAccountingArgument.simplifiedTaxationSystemMax( dto.getSimplifiedTaxationSystemMax() );
        createAccountingArgument.patentMin( dto.getPatentMin() );
        createAccountingArgument.patentMax( dto.getPatentMax() );

        return createAccountingArgument.build();
    }
}
