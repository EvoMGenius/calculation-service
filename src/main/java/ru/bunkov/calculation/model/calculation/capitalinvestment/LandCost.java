package ru.bunkov.calculation.model.calculation.capitalinvestment;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.List;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandCost {
    @ElementCollection
    private List<String> regionNames;

    private Double areaOnRegions;

    private BigDecimal minTotalLandCost;

    private BigDecimal maxTotalLandCost;
}
