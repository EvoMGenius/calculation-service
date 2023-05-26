package ru.bunkov.calculation.api.income.result.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.income.result.dto.ConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.CreateConditionalResultDto;
import ru.bunkov.calculation.api.income.result.dto.SearchConditionalResultDto;
import ru.bunkov.calculation.model.income.ConditionalResult;
import ru.bunkov.calculation.service.income.result.argument.CreateConditionalResultArgument;
import ru.bunkov.calculation.service.income.result.argument.SearchConditionalResultArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:23+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class ConditionalResultMapperImpl implements ConditionalResultMapper {

    @Override
    public SearchConditionalResultArgument toSearchArgument(SearchConditionalResultDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchConditionalResultArgument.SearchConditionalResultArgumentBuilder searchConditionalResultArgument = SearchConditionalResultArgument.builder();

        searchConditionalResultArgument.conditionDescription( dto.getConditionDescription() );
        searchConditionalResultArgument.potentialAnnualIncome( dto.getPotentialAnnualIncome() );
        searchConditionalResultArgument.rate( dto.getRate() );
        searchConditionalResultArgument.totalPotentCost( dto.getTotalPotentCost() );

        return searchConditionalResultArgument.build();
    }

    @Override
    public ConditionalResultDto toDto(ConditionalResult conditionalResult) {
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

    @Override
    public CreateConditionalResultArgument toCreateArgument(CreateConditionalResultDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateConditionalResultArgument.CreateConditionalResultArgumentBuilder createConditionalResultArgument = CreateConditionalResultArgument.builder();

        createConditionalResultArgument.conditionDescription( dto.getConditionDescription() );
        createConditionalResultArgument.potentialAnnualIncome( dto.getPotentialAnnualIncome() );
        createConditionalResultArgument.rate( dto.getRate() );
        createConditionalResultArgument.totalPotentCost( dto.getTotalPotentCost() );

        return createConditionalResultArgument.build();
    }
}
