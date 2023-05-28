package ru.bunkov.calculation.api.external.industry.subindustry.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.CreateSubindustryDto;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SearchSubindustryDto;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T06:54:41+1000",
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
        searchSubindustryArgument.taxSumm2021( dto.getTaxSumm2021() );
        searchSubindustryArgument.taxSumm2022( dto.getTaxSumm2022() );
        searchSubindustryArgument.spendOnHiringStaff2020( dto.getSpendOnHiringStaff2020() );
        searchSubindustryArgument.spendOnHiringStaff2021( dto.getSpendOnHiringStaff2021() );

        return searchSubindustryArgument.build();
    }

    @Override
    public SubindustryDto toDto(Subindustry subindustry) {
        if ( subindustry == null ) {
            return null;
        }

        SubindustryDto.SubindustryDtoBuilder subindustryDto = SubindustryDto.builder();

        subindustryDto.id( subindustry.getId() );
        subindustryDto.name( subindustry.getName() );
        subindustryDto.averageEmployeeCount2020( subindustry.getAverageEmployeeCount2020() );
        subindustryDto.averageEmployeeCount2021( subindustry.getAverageEmployeeCount2021() );
        subindustryDto.averageSalary2020( subindustry.getAverageSalary2020() );
        subindustryDto.averageSalary2021( subindustry.getAverageSalary2021() );
        subindustryDto.taxToMoscowBudget2021( subindustry.getTaxToMoscowBudget2021() );
        subindustryDto.taxToMoscowBudget2022( subindustry.getTaxToMoscowBudget2022() );
        subindustryDto.incomeTax2021( subindustry.getIncomeTax2021() );
        subindustryDto.incomeTax2022( subindustry.getIncomeTax2022() );
        subindustryDto.propertyTax2021( subindustry.getPropertyTax2021() );
        subindustryDto.propertyTax2022( subindustry.getPropertyTax2022() );
        subindustryDto.landTax2021( subindustry.getLandTax2021() );
        subindustryDto.landTax2022( subindustry.getLandTax2022() );
        subindustryDto.personalIncomeTax2021( subindustry.getPersonalIncomeTax2021() );
        subindustryDto.personalIncomeTax2022( subindustry.getPersonalIncomeTax2022() );
        subindustryDto.transportTax2021( subindustry.getTransportTax2021() );
        subindustryDto.transportTax2022( subindustry.getTransportTax2022() );
        subindustryDto.otherTax2021( subindustry.getOtherTax2021() );
        subindustryDto.otherTax2022( subindustry.getOtherTax2022() );
        subindustryDto.taxSumm2021( subindustry.getTaxSumm2021() );
        subindustryDto.taxSumm2022( subindustry.getTaxSumm2022() );
        subindustryDto.spendOnHiringStaff2020( subindustry.getSpendOnHiringStaff2020() );
        subindustryDto.spendOnHiringStaff2021( subindustry.getSpendOnHiringStaff2021() );

        return subindustryDto.build();
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
        createSubindustryArgument.taxSumm2021( dto.getTaxSumm2021() );
        createSubindustryArgument.taxSumm2022( dto.getTaxSumm2022() );
        createSubindustryArgument.spendOnHiringStaff2020( dto.getSpendOnHiringStaff2020() );
        createSubindustryArgument.spendOnHiringStaff2021( dto.getSpendOnHiringStaff2021() );

        return createSubindustryArgument.build();
    }
}
