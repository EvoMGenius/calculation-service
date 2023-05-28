package ru.bunkov.calculation.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CapitalBuildingObj {

    @Id
    @GeneratedValue
    private UUID id;

    private String type;

    private BigDecimal cost;
}
