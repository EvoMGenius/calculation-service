package ru.bunkov.calculation.api.external.industry.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ru.bunkov.calculation.action.industry.CreateIndustryActionArgument;
import ru.bunkov.calculation.api.external.industry.dto.CreateIndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.IndustryDto;
import ru.bunkov.calculation.api.external.industry.dto.SearchIndustryDto;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.CreateSubindustryDto;
import ru.bunkov.calculation.api.external.industry.subindustry.dto.SubindustryDto;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T05:58:33+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class IndustryMapperImpl implements IndustryMapper {

    @Override
    public SearchIndustryArgument toSearchArgument(SearchIndustryDto dto) {
        if ( dto == null ) {
            return null;
        }

        SearchIndustryArgument.SearchIndustryArgumentBuilder searchIndustryArgument = SearchIndustryArgument.builder();

        searchIndustryArgument.name( dto.getName() );

        return searchIndustryArgument.build();
    }

    @Override
    public IndustryDto toDto(Industry industry) {
        if ( industry == null ) {
            return null;
        }

        IndustryDto industryDto = new IndustryDto();

        industryDto.setId( industry.getId() );
        industryDto.setName( industry.getName() );
        industryDto.setSubindustry( subindustryListToSubindustryDtoList( industry.getSubindustry() ) );

        return industryDto;
    }

    @Override
    public CreateIndustryArgument toCreateArgument(CreateIndustryDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateIndustryArgument.CreateIndustryArgumentBuilder createIndustryArgument = CreateIndustryArgument.builder();

        createIndustryArgument.name( dto.getName() );
        createIndustryArgument.subindustry( createSubindustryDtoListToSubindustryList( dto.getSubindustry() ) );

        return createIndustryArgument.build();
    }

    @Override
    public CreateIndustryActionArgument toCreateActionArgument(CreateIndustryDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateIndustryActionArgument.CreateIndustryActionArgumentBuilder createIndustryActionArgument = CreateIndustryActionArgument.builder();

        createIndustryActionArgument.name( dto.getName() );
        createIndustryActionArgument.subindustry( createSubindustryDtoListToSubindustryDtoList( dto.getSubindustry() ) );

        return createIndustryActionArgument.build();
    }

    protected SubindustryDto subindustryToSubindustryDto(Subindustry subindustry) {
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

    protected List<SubindustryDto> subindustryListToSubindustryDtoList(List<Subindustry> list) {
        if ( list == null ) {
            return null;
        }

        List<SubindustryDto> list1 = new ArrayList<SubindustryDto>( list.size() );
        for ( Subindustry subindustry : list ) {
            list1.add( subindustryToSubindustryDto( subindustry ) );
        }

        return list1;
    }

    protected Subindustry createSubindustryDtoToSubindustry(CreateSubindustryDto createSubindustryDto) {
        if ( createSubindustryDto == null ) {
            return null;
        }

        Subindustry.SubindustryBuilder subindustry = Subindustry.builder();

        subindustry.name( createSubindustryDto.getName() );
        subindustry.averageEmployeeCount2020( createSubindustryDto.getAverageEmployeeCount2020() );
        subindustry.averageEmployeeCount2021( createSubindustryDto.getAverageEmployeeCount2021() );
        subindustry.averageSalary2020( createSubindustryDto.getAverageSalary2020() );
        subindustry.averageSalary2021( createSubindustryDto.getAverageSalary2021() );
        subindustry.taxToMoscowBudget2021( createSubindustryDto.getTaxToMoscowBudget2021() );
        subindustry.taxToMoscowBudget2022( createSubindustryDto.getTaxToMoscowBudget2022() );
        subindustry.incomeTax2021( createSubindustryDto.getIncomeTax2021() );
        subindustry.incomeTax2022( createSubindustryDto.getIncomeTax2022() );
        subindustry.propertyTax2021( createSubindustryDto.getPropertyTax2021() );
        subindustry.propertyTax2022( createSubindustryDto.getPropertyTax2022() );
        subindustry.landTax2021( createSubindustryDto.getLandTax2021() );
        subindustry.landTax2022( createSubindustryDto.getLandTax2022() );
        subindustry.personalIncomeTax2021( createSubindustryDto.getPersonalIncomeTax2021() );
        subindustry.personalIncomeTax2022( createSubindustryDto.getPersonalIncomeTax2022() );
        subindustry.transportTax2021( createSubindustryDto.getTransportTax2021() );
        subindustry.transportTax2022( createSubindustryDto.getTransportTax2022() );
        subindustry.otherTax2021( createSubindustryDto.getOtherTax2021() );
        subindustry.otherTax2022( createSubindustryDto.getOtherTax2022() );
        subindustry.taxSumm2021( createSubindustryDto.getTaxSumm2021() );
        subindustry.taxSumm2022( createSubindustryDto.getTaxSumm2022() );
        subindustry.spendOnHiringStaff2020( createSubindustryDto.getSpendOnHiringStaff2020() );
        subindustry.spendOnHiringStaff2021( createSubindustryDto.getSpendOnHiringStaff2021() );

        return subindustry.build();
    }

    protected List<Subindustry> createSubindustryDtoListToSubindustryList(List<CreateSubindustryDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Subindustry> list1 = new ArrayList<Subindustry>( list.size() );
        for ( CreateSubindustryDto createSubindustryDto : list ) {
            list1.add( createSubindustryDtoToSubindustry( createSubindustryDto ) );
        }

        return list1;
    }

    protected SubindustryDto createSubindustryDtoToSubindustryDto(CreateSubindustryDto createSubindustryDto) {
        if ( createSubindustryDto == null ) {
            return null;
        }

        SubindustryDto.SubindustryDtoBuilder subindustryDto = SubindustryDto.builder();

        subindustryDto.name( createSubindustryDto.getName() );
        subindustryDto.averageEmployeeCount2020( createSubindustryDto.getAverageEmployeeCount2020() );
        subindustryDto.averageEmployeeCount2021( createSubindustryDto.getAverageEmployeeCount2021() );
        subindustryDto.averageSalary2020( createSubindustryDto.getAverageSalary2020() );
        subindustryDto.averageSalary2021( createSubindustryDto.getAverageSalary2021() );
        subindustryDto.taxToMoscowBudget2021( createSubindustryDto.getTaxToMoscowBudget2021() );
        subindustryDto.taxToMoscowBudget2022( createSubindustryDto.getTaxToMoscowBudget2022() );
        subindustryDto.incomeTax2021( createSubindustryDto.getIncomeTax2021() );
        subindustryDto.incomeTax2022( createSubindustryDto.getIncomeTax2022() );
        subindustryDto.propertyTax2021( createSubindustryDto.getPropertyTax2021() );
        subindustryDto.propertyTax2022( createSubindustryDto.getPropertyTax2022() );
        subindustryDto.landTax2021( createSubindustryDto.getLandTax2021() );
        subindustryDto.landTax2022( createSubindustryDto.getLandTax2022() );
        subindustryDto.personalIncomeTax2021( createSubindustryDto.getPersonalIncomeTax2021() );
        subindustryDto.personalIncomeTax2022( createSubindustryDto.getPersonalIncomeTax2022() );
        subindustryDto.transportTax2021( createSubindustryDto.getTransportTax2021() );
        subindustryDto.transportTax2022( createSubindustryDto.getTransportTax2022() );
        subindustryDto.otherTax2021( createSubindustryDto.getOtherTax2021() );
        subindustryDto.otherTax2022( createSubindustryDto.getOtherTax2022() );
        subindustryDto.taxSumm2021( createSubindustryDto.getTaxSumm2021() );
        subindustryDto.taxSumm2022( createSubindustryDto.getTaxSumm2022() );
        subindustryDto.spendOnHiringStaff2020( createSubindustryDto.getSpendOnHiringStaff2020() );
        subindustryDto.spendOnHiringStaff2021( createSubindustryDto.getSpendOnHiringStaff2021() );

        return subindustryDto.build();
    }

    protected List<SubindustryDto> createSubindustryDtoListToSubindustryDtoList(List<CreateSubindustryDto> list) {
        if ( list == null ) {
            return null;
        }

        List<SubindustryDto> list1 = new ArrayList<SubindustryDto>( list.size() );
        for ( CreateSubindustryDto createSubindustryDto : list ) {
            list1.add( createSubindustryDtoToSubindustryDto( createSubindustryDto ) );
        }

        return list1;
    }
}
