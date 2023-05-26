package ru.bunkov.calculation.api.industry.subindustry.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.industry.subindustry.dto.CreateSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SearchSubindustryDto;
import ru.bunkov.calculation.api.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T04:02:23+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class SubIndustryMapperImpl implements SubIndustryMapper {

    @Override
    public SearchSubindustryArgument toSearchArgument(SearchSubindustryDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchSubindustryArgument.SearchSubindustryArgumentBuilder searchSubindustryArgument = SearchSubindustryArgument.builder();

        searchSubindustryArgument.name( dto.getName() );
        searchSubindustryArgument.averageEmployeeCount2020( dto.getAverageEmployeeCount2020() );
        searchSubindustryArgument.averageEmployeeCount2021( dto.getAverageEmployeeCount2021() );
        searchSubindustryArgument.averageSalary2020( dto.getAverageSalary2020() );
        searchSubindustryArgument.averageSalary2021( dto.getAverageSalary2021() );
        searchSubindustryArgument.taxToMoscowBudget2021( dto.getTaxToMoscowBudget2021() );
        searchSubindustryArgument.taxToMoscowBudget2022( dto.getTaxToMoscowBudget2022() );
        searchSubindustryArgument.incomeTax2021( dto.getIncomeTax2021() );
        searchSubindustryArgument.incomeTax2022( dto.getIncomeTax2022() );
        searchSubindustryArgument.propertyTax2021( dto.getPropertyTax2021() );
        searchSubindustryArgument.propertyTax2022( dto.getPropertyTax2022() );
        searchSubindustryArgument.landTax2021( dto.getLandTax2021() );
        searchSubindustryArgument.landTax2022( dto.getLandTax2022() );
        searchSubindustryArgument.personalIncomeTax2021( dto.getPersonalIncomeTax2021() );
        searchSubindustryArgument.personalIncomeTax2022( dto.getPersonalIncomeTax2022() );
        searchSubindustryArgument.transportTax2021( dto.getTransportTax2021() );
        searchSubindustryArgument.transportTax2022( dto.getTransportTax2022() );
        searchSubindustryArgument.otherTax2021( dto.getOtherTax2021() );
        searchSubindustryArgument.otherTax2022( dto.getOtherTax2022() );

        return searchSubindustryArgument.build();
    }

    @Override
    public SubindustryDto toDto(Subindustry subindustry) {
        if ( subindustry == null ) {
            return null;
        }

        SubindustryDto subindustryDto = new SubindustryDto();

        subindustryDto.setId( subindustry.getId() );
        subindustryDto.setName( subindustry.getName() );
        subindustryDto.setAverageEmployeeCount2020( subindustry.getAverageEmployeeCount2020() );
        subindustryDto.setAverageEmployeeCount2021( subindustry.getAverageEmployeeCount2021() );
        subindustryDto.setAverageSalary2020( subindustry.getAverageSalary2020() );
        subindustryDto.setAverageSalary2021( subindustry.getAverageSalary2021() );
        subindustryDto.setTaxToMoscowBudget2021( subindustry.getTaxToMoscowBudget2021() );
        subindustryDto.setTaxToMoscowBudget2022( subindustry.getTaxToMoscowBudget2022() );
        subindustryDto.setIncomeTax2021( subindustry.getIncomeTax2021() );
        subindustryDto.setIncomeTax2022( subindustry.getIncomeTax2022() );
        subindustryDto.setPropertyTax2021( subindustry.getPropertyTax2021() );
        subindustryDto.setPropertyTax2022( subindustry.getPropertyTax2022() );
        subindustryDto.setLandTax2021( subindustry.getLandTax2021() );
        subindustryDto.setLandTax2022( subindustry.getLandTax2022() );
        subindustryDto.setPersonalIncomeTax2021( subindustry.getPersonalIncomeTax2021() );
        subindustryDto.setPersonalIncomeTax2022( subindustry.getPersonalIncomeTax2022() );
        subindustryDto.setTransportTax2021( subindustry.getTransportTax2021() );
        subindustryDto.setTransportTax2022( subindustry.getTransportTax2022() );
        subindustryDto.setOtherTax2021( subindustry.getOtherTax2021() );
        subindustryDto.setOtherTax2022( subindustry.getOtherTax2022() );

        return subindustryDto;
    }

    @Override
    public CreateSubindustryArgument toCreateArgument(CreateSubindustryDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateSubindustryArgument.CreateSubindustryArgumentBuilder createSubindustryArgument = CreateSubindustryArgument.builder();

        createSubindustryArgument.name( dto.getName() );
        createSubindustryArgument.averageEmployeeCount2020( dto.getAverageEmployeeCount2020() );
        createSubindustryArgument.averageEmployeeCount2021( dto.getAverageEmployeeCount2021() );
        createSubindustryArgument.averageSalary2020( dto.getAverageSalary2020() );
        createSubindustryArgument.averageSalary2021( dto.getAverageSalary2021() );
        createSubindustryArgument.taxToMoscowBudget2021( dto.getTaxToMoscowBudget2021() );
        createSubindustryArgument.taxToMoscowBudget2022( dto.getTaxToMoscowBudget2022() );
        createSubindustryArgument.incomeTax2021( dto.getIncomeTax2021() );
        createSubindustryArgument.incomeTax2022( dto.getIncomeTax2022() );
        createSubindustryArgument.propertyTax2021( dto.getPropertyTax2021() );
        createSubindustryArgument.propertyTax2022( dto.getPropertyTax2022() );
        createSubindustryArgument.landTax2021( dto.getLandTax2021() );
        createSubindustryArgument.landTax2022( dto.getLandTax2022() );
        createSubindustryArgument.personalIncomeTax2021( dto.getPersonalIncomeTax2021() );
        createSubindustryArgument.personalIncomeTax2022( dto.getPersonalIncomeTax2022() );
        createSubindustryArgument.transportTax2021( dto.getTransportTax2021() );
        createSubindustryArgument.transportTax2022( dto.getTransportTax2022() );
        createSubindustryArgument.otherTax2021( dto.getOtherTax2021() );
        createSubindustryArgument.otherTax2022( dto.getOtherTax2022() );

        return createSubindustryArgument.build();
    }
}
