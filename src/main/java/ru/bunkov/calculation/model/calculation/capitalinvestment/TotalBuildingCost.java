package ru.bunkov.calculation.model.calculation.capitalinvestment;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TotalBuildingCost {

    @ElementCollection
    @AttributeOverrides({
            @AttributeOverride(name = "buildingCostId", column = @Column(name = "buildingCostId")),
            @AttributeOverride(name = "area", column = @Column(name = "area"))
    })
    private List<PairForBuilding> buildingCostIdAndAreaPairList;

    private Double totalBuildingCost;
}
