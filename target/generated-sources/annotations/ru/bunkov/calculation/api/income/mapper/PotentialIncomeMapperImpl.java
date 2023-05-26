package ru.bunkov.calculation.api.income.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ru.bunkov.calculation.action.income.CreatePotentialIncomeActionArgument;
import ru.bunkov.calculation.api.income.dto.CreatePotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.PotentialIncomeDto;
import ru.bunkov.calculation.api.income.dto.SearchPotentialIncomeDto;
import ru.bunkov.calculation.api.income.result.dto.ConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.model.income.PotentialIncome;
import ru.bunkov.calculation.service.income.argument.CreatePotentialIncomeArgument;
import ru.bunkov.calculation.service.income.argument.SearchPotentialIncomeArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:22+1000",
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
        potentialIncomeDto.setResult( conditionalResultListToConditionalResultDtoList( potentialIncome.getResult() ) );

        return potentialIncomeDto;
    }

    @Override
    public CreatePotentialIncomeArgument toCreateArgument(CreatePotentialIncomeDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreatePotentialIncomeArgument.CreatePotentialIncomeArgumentBuilder createPotentialIncomeArgument = CreatePotentialIncomeArgument.builder();

        createPotentialIncomeArgument.typeOfBusiness( dto.getTypeOfBusiness() );
        createPotentialIncomeArgument.result( createConditionalResultDtoListToConditionalResultList( dto.getResult() ) );

        return createPotentialIncomeArgument.build();
    }

    @Override
    public CreatePotentialIncomeActionArgument toCreateActionArgument(CreatePotentialIncomeDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreatePotentialIncomeActionArgument.CreatePotentialIncomeActionArgumentBuilder createPotentialIncomeActionArgument = CreatePotentialIncomeActionArgument.builder();

        createPotentialIncomeActionArgument.typeOfBusiness( dto.getTypeOfBusiness() );
        List<CreateConditionalResultDto> list = dto.getResult();
        if ( list != null ) {
            createPotentialIncomeActionArgument.result( new ArrayList<CreateConditionalResultDto>( list ) );
        }

        return createPotentialIncomeActionArgument.build();
    }

    protected ConditionalResultDto conditionalResultToConditionalResultDto(ConditionalResult conditionalResult) {
        if ( conditionalResult == null ) {
            return null;
        }

        ConditionalResultDto conditionalResultDto = new ConditionalResultDto();

        conditionalResultDto.setId( conditionalResult.getId() );
        conditionalResultDto.setConditionDescription( conditionalResult.getConditionDescription() );
        conditionalResultDto.setPotentialAnnualIncome( conditionalResult.getPotentialAnnualIncome() );
        conditionalResultDto.setRate( conditionalResult.getRate() );
        conditionalResultDto.setTotalPotentCost( conditionalResult.getTotalPotentCost() );

        return conditionalResultDto;
    }

    protected List<ConditionalResultDto> conditionalResultListToConditionalResultDtoList(List<ConditionalResult> list) {
        if ( list == null ) {
            return null;
        }

        List<ConditionalResultDto> list1 = new ArrayList<ConditionalResultDto>( list.size() );
        for ( ConditionalResult conditionalResult : list ) {
            list1.add( conditionalResultToConditionalResultDto( conditionalResult ) );
        }

        return list1;
    }

    protected ConditionalResult createConditionalResultDtoToConditionalResult(CreateConditionalResultDto createConditionalResultDto) {
        if ( createConditionalResultDto == null ) {
            return null;
        }

        ConditionalResult.ConditionalResultBuilder conditionalResult = ConditionalResult.builder();

        conditionalResult.conditionDescription( createConditionalResultDto.getConditionDescription() );
        conditionalResult.potentialAnnualIncome( createConditionalResultDto.getPotentialAnnualIncome() );
        conditionalResult.rate( createConditionalResultDto.getRate() );
        conditionalResult.totalPotentCost( createConditionalResultDto.getTotalPotentCost() );

        return conditionalResult.build();
    }

    protected List<ConditionalResult> createConditionalResultDtoListToConditionalResultList(List<CreateConditionalResultDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ConditionalResult> list1 = new ArrayList<ConditionalResult>( list.size() );
        for ( CreateConditionalResultDto createConditionalResultDto : list ) {
            list1.add( createConditionalResultDtoToConditionalResult( createConditionalResultDto ) );
        }

        return list1;
    }
}
