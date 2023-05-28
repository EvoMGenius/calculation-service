package ru.bunkov.calculation.model.income;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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

    private BigDecimal potentialAnnualIncome;

    private BigDecimal rate;

    private BigDecimal totalPotentCost;
}
