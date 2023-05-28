package ru.bunkov.calculation.model.calculation.capitalinvestment;

import java.util.List;
import java.util.UUID;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandCost {
    @ElementCollection
    private List<UUID> regionIds;

    private Double areaOnRegions;

    private Double minTotalLandCost;

    private Double maxTotalLandCost;
}
