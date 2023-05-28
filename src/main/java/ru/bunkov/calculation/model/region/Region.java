package ru.bunkov.calculation.model.region;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Comparator;
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

    private BigDecimal purchaseLand;

    private BigDecimal landLease;

    private BigDecimal rentRoomMin;

    private BigDecimal rentRoomMax;

    public static Comparator<Region> rentRoomMinComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return o1.rentRoomMin.compareTo(o2.rentRoomMin);
        }
    };

    public static Comparator<Region> rentRoomMaxComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return o1.rentRoomMax.compareTo(o2.rentRoomMax);
        }
    };

    public static Comparator<Region> landLeaseComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return o1.landLease.compareTo(o2.landLease);
        }
    };

    public static Comparator<Region> purchaseLandComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return o1.purchaseLand.compareTo(o2.purchaseLand);
        }
    };
}
