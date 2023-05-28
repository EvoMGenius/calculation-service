package ru.bunkov.calculation.model.calculation.openingproductioncost;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HiringStaff {
    private Double staffCount;

    private Double averageSalary;

    private final int months = 12;

    private final float rate = 0.15f;

    private Double totalStaffCost;
}
