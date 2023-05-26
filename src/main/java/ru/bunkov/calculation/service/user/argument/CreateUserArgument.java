package ru.bunkov.calculation.service.user.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateUserArgument {

    String lastName;

    String firstName;

    String middleName;

    String organizationName;

    String taxpayerNumber;

    String industry;

    String country;

    String city;

    String position;

    String email;

    String password;
}
