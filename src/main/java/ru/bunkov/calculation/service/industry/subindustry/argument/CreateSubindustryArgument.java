package ru.bunkov.calculation.service.industry.subindustry.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateSubindustryArgument {

    String name;

    Double averageEmployeeCount2020;

    Double averageEmployeeCount2021;

    Double averageSalary2020;

    Double averageSalary2021;

    Double taxToMoscowBudget2021;

    Double taxToMoscowBudget2022;

    Double incomeTax2021;

    Double incomeTax2022;

    Double propertyTax2021;

    Double propertyTax2022;

    Double landTax2021;

    Double landTax2022;

    Double personalIncomeTax2021;

    Double personalIncomeTax2022;

    Double transportTax2021;

    Double transportTax2022;

    Double otherTax2021;

    Double otherTax2022;
}
