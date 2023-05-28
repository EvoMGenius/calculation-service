package ru.bunkov.calculation.api.external.whoami.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class WhoAmIDto {

    private UUID id;

    private String lastName;

    private String firstName;

    private String middleName;

    private String organizationName;

    private String taxpayerNumber;

    private String industry;

    private String country;

    private String city;

    private String position;

    private String email;
}
