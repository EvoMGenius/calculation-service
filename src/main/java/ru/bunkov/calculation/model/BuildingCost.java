package ru.bunkov.calculation.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuildingCost {

    @Id
    @GeneratedValue
    private UUID id;

    private String type;

    private Double cost;
}
