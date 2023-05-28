package ru.bunkov.calculation.model.calculation.capitalinvestment;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.List;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TotalCapitalBuildingCost {

    @ElementCollection
    @AttributeOverrides({
            @AttributeOverride(name = "buildingCostId", column = @Column(name = "buildingCostId")),
            @AttributeOverride(name = "area", column = @Column(name = "area"))
    })
    private List<PairForCapitalBuilding> capitalBuildingObjIdAndAreaPairList;

    private Double totalCapitalBuildingCost;
}
