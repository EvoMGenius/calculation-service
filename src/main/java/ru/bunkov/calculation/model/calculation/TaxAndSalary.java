package ru.bunkov.calculation.model.calculation;
import lombok.*;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxAndSalary {
    private UUID industryId;

    private UUID subindustryId;

    private Double totalSalaryPayment;
    //todo записать все налоги

}
