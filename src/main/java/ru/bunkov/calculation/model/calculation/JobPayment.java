package ru.bunkov.calculation.model.calculation;
import lombok.*;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobPayment {

    private BigDecimal totalJobPayment;

    private BigDecimal totalPayedSalary;

    private BigDecimal mainTaxes;
}
