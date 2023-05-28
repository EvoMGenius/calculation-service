package ru.bunkov.calculation.model.calculation.openingproductioncost;

import lombok.*;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PairForEquipment {
    private UUID equipmentId;
    private Integer count;
}
