package ru.bunkov.calculation.model.calculation.capitalinvestment;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CapitalInvestments {

    @Embedded
    private LandCost landCost;

    @Embedded
    private TotalBuildingCost totalBuildingCost;

    @Embedded
    private TotalCapitalBuildingCost totalCapitalBuildingCost;

    private BigDecimal totalCostMin;

    private BigDecimal totalCostMax;
}
