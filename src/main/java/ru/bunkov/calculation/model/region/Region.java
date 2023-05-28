package ru.bunkov.calculation.model.region;

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
public class Region {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private Double purchaseLand;

    private Double landLease;

    private Double rentRoomMin;

    private Double rentRoomMax;
}
