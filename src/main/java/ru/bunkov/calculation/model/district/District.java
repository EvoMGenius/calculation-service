package ru.bunkov.calculation.model.district;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @Id
    @GeneratedValue
    private UUID id;

    private String district;

    @ManyToMany
    private List<Region> regions;

    private Double averageCost;

}
