package ru.bunkov.calculation.api.industry.subindustry.dto;

import lombok.Data;

@Data
public class CreateSubindustryDto {

    private String name;

    private Double averageEmployeeCount2020;

    private Double averageEmployeeCount2021;

    private Double averageSalary2020;

    private Double averageSalary2021;

    private Double taxToMoscowBudget2021;

    private Double taxToMoscowBudget2022;

    private Double incomeTax2021;

    private Double incomeTax2022;

    private Double propertyTax2021;

    private Double propertyTax2022;

    private Double landTax2021;

    private Double landTax2022;

    private Double personalIncomeTax2021;

    private Double personalIncomeTax2022;

    private Double transportTax2021;

    private Double transportTax2022;

    private Double otherTax2021;

    private Double otherTax2022;
}
