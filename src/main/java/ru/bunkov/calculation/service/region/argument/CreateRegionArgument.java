package ru.bunkov.calculation.service.region.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateRegionArgument {
    String name;

    Double purchaseLand;

    Double landLease;

    Double rentRoomMin;

    Double rentRoomMax;
}
