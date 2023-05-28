package ru.bunkov.calculation.model.calculation;

import lombok.*;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.calculation.capitalinvestment.CapitalInvestments;
import ru.bunkov.calculation.model.calculation.openingproductioncost.CostsOfOpeningProduction;

import javax.persistence.*;
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
    private TaxAndSalary taxAndSalary;

    @ManyToOne
    private Accounting accounting;

    private Double totalCostMinOfAll;

    private Double totalCostMaxOfAll;

}
