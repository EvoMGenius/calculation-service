package ru.bunkov.calculation.api.external.income.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.income.dto.CreatePotentialIncomeDto;
import ru.bunkov.calculation.api.external.income.dto.PotentialIncomeDto;
import ru.bunkov.calculation.api.external.income.dto.SearchPotentialIncomeDto;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T05:58:32+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class PotentialIncomeMapperImpl implements PotentialIncomeMapper {

    @Override
    public SearchPotentialIncomeArgument toSearchArgument(SearchPotentialIncomeDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchPotentialIncomeArgument.SearchPotentialIncomeArgumentBuilder searchPotentialIncomeArgument = SearchPotentialIncomeArgument.builder();

        searchPotentialIncomeArgument.typeOfBusiness( dto.getTypeOfBusiness() );
        searchPotentialIncomeArgument.potentialAnnualIncome( dto.getPotentialAnnualIncome() );
        searchPotentialIncomeArgument.rate( dto.getRate() );
        searchPotentialIncomeArgument.totalPotentCost( dto.getTotalPotentCost() );

        return searchPotentialIncomeArgument.build();
    }

    @Override
    public PotentialIncomeDto toDto(PotentialIncome potentialIncome) {
        if ( potentialIncome == null ) {
            return null;
        }

        PotentialIncomeDto potentialIncomeDto = new PotentialIncomeDto();

        potentialIncomeDto.setId( potentialIncome.getId() );
        potentialIncomeDto.setTypeOfBusiness( potentialIncome.getTypeOfBusiness() );
        potentialIncomeDto.setPotentialAnnualIncome( potentialIncome.getPotentialAnnualIncome() );
        potentialIncomeDto.setRate( potentialIncome.getRate() );
        potentialIncomeDto.setTotalPotentCost( potentialIncome.getTotalPotentCost() );

        return potentialIncomeDto;
    }

    @Override
    public CreatePotentialIncomeArgument toCreateArgument(CreatePotentialIncomeDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreatePotentialIncomeArgument.CreatePotentialIncomeArgumentBuilder createPotentialIncomeArgument = CreatePotentialIncomeArgument.builder();

        createPotentialIncomeArgument.typeOfBusiness( dto.getTypeOfBusiness() );
        createPotentialIncomeArgument.potentialAnnualIncome( dto.getPotentialAnnualIncome() );
        createPotentialIncomeArgument.rate( dto.getRate() );
        createPotentialIncomeArgument.totalPotentCost( dto.getTotalPotentCost() );

        return createPotentialIncomeArgument.build();
    }
}
