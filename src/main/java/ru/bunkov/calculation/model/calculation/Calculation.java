package ru.bunkov.calculation.model.calculation;

import lombok.*;
import ru.bunkov.calculation.model.calculation.capitalinvestment.CapitalInvestments;
import ru.bunkov.calculation.model.calculation.openingproductioncost.CostsOfOpeningProduction;

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
public class Calculation {

    @Id
    @GeneratedValue
    private UUID id;

    @Embedded
    private CapitalInvestments capitalInvestments;

    @Embedded
    private CostsOfOpeningProduction costsOfOpeningProduction;

    @Embedded
    private Expenses expenses;

    private BigDecimal accountingCost;

    private BigDecimal initialExpenses;

    private BigDecimal totalCostMinOfAll;

    private BigDecimal totalCostMaxOfAll;

    @ElementCollection
    private List<String> otherNeeds;
}
