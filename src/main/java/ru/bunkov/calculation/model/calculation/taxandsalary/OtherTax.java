package ru.bunkov.calculation.model.calculation.taxandsalary;

import lombok.*;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OtherTax {

    private BigDecimal totalOtherTax;

    private BigDecimal landTax;

    private BigDecimal propertyTax;

    private BigDecimal transportTax;

    private BigDecimal otherTax;
}
