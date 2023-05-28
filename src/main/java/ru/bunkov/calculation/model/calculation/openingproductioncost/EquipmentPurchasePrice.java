package ru.bunkov.calculation.model.calculation.openingproductioncost;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentPurchasePrice {

    @ElementCollection
    @AttributeOverrides({
            @AttributeOverride(name = "equipmentId", column = @Column(name = "equipmentId")),
            @AttributeOverride(name = "count", column = @Column(name = "count"))
    })
    private List<PairForEquipment> equipmentIdAndCountPairList;

    private BigDecimal totalEquipmentCost;
}
