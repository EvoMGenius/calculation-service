package ru.bunkov.calculation.model.calculation;
import lombok.*;
import ru.bunkov.calculation.model.calculation.taxandsalary.OtherTax;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Expenses {

    private UUID industryId;

    private UUID subindustryId;

    @Embedded
    private JobPayment jobPayment;

    @Embedded
    private OtherTax otherTax;

}
