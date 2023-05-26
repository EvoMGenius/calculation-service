package ru.bunkov.calculation.model.industry;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subindustry {

    @Id
    @GeneratedValue
    private UUID id;

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
