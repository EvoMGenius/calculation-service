package ru.bunkov.calculation.model.income;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PotentialIncome {

    @Id
    @GeneratedValue
    private UUID id;

    private String typeOfBusiness;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
