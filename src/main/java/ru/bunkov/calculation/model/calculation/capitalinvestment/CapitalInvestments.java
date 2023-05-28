package ru.bunkov.calculation.model.calculation.capitalinvestment;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

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

    private Double totalCostMin;

    private Double totalCostMax;
}
