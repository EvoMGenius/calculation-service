package ru.bunkov.calculation.service.region.argument;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchRegionArgument {

    String name;

    BigDecimal purchaseLand;

    BigDecimal landLease;

    BigDecimal rentRoomMin;

    BigDecimal rentRoomMax;
}
