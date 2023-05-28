package ru.bunkov.calculation.model.income;

import lombok.*;

import javax.persistence.*;
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

    @Column(columnDefinition = "text")
    private String typeOfBusiness;

    private Double potentialAnnualIncome;

    private Double rate;

    private Double totalPotentCost;
}
