package ru.bunkov.calculation.model.calculation.openingproductioncost;

import lombok.*;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HiringStaff {
    private Double staffCount;

    private BigDecimal averageSalary;

    private BigDecimal totalStaffCost;
}
