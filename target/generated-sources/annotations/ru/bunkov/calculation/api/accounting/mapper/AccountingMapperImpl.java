package ru.bunkov.calculation.api.accounting.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.accounting.dto.AccountingDto;
import ru.bunkov.calculation.api.accounting.dto.CreateAccountingDto;
import ru.bunkov.calculation.api.accounting.dto.SearchAccountingDto;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.service.accounting.argument.CreateAccountingArgument;
import ru.bunkov.calculation.service.accounting.argument.SearchAccountingArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:23+1000",
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
        searchAccountingArgument.generalTaxationSystem( dto.getGeneralTaxationSystem() );
        searchAccountingArgument.simplifiedTaxationSystem( dto.getSimplifiedTaxationSystem() );
        searchAccountingArgument.patent( dto.getPatent() );

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
        accountingDto.setGeneralTaxationSystem( accounting.getGeneralTaxationSystem() );
        accountingDto.setSimplifiedTaxationSystem( accounting.getSimplifiedTaxationSystem() );
        accountingDto.setPatent( accounting.getPatent() );

        return accountingDto;
    }

    @Override
    public CreateAccountingArgument toCreateArgument(CreateAccountingDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateAccountingArgument.CreateAccountingArgumentBuilder createAccountingArgument = CreateAccountingArgument.builder();

        createAccountingArgument.organizationalAndLegalForm( dto.getOrganizationalAndLegalForm() );
        createAccountingArgument.generalTaxationSystem( dto.getGeneralTaxationSystem() );
        createAccountingArgument.simplifiedTaxationSystem( dto.getSimplifiedTaxationSystem() );
        createAccountingArgument.patent( dto.getPatent() );

        return createAccountingArgument.build();
    }
}
