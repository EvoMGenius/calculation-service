package ru.bunkov.calculation.model.calculation.openingproductioncost;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchasePatent {

    private boolean isIEAndTaxSystemIsPatent;

    private UUID potentialIncomeId;

    private BigDecimal patentCost;
}
