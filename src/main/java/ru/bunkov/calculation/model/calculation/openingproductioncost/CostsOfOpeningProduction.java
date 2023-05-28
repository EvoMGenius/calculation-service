package ru.bunkov.calculation.model.calculation.openingproductioncost;

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
public class CostsOfOpeningProduction {

    @Embedded
    private EquipmentPurchasePrice equipmentPurchasePrice;

    @Embedded
    private HiringStaff hiringStaff;

    @Embedded
    private PurchasePatent purchasePatent;

    private BigDecimal totalCostOfOpeningProduction;
}
