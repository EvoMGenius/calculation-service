package ru.bunkov.calculation.model.calculation.capitalinvestment;

import java.util.UUID;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PairForBuilding {
    private UUID buildingCostId;
    private Double area;
}
