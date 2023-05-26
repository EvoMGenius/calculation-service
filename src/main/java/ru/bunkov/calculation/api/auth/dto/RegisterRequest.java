package ru.bunkov.calculation.api.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank
    private String lastName;

    @NotBlank
    private String firstName;

    private String middleName;

    private String organizationName;

    @NotBlank
    private String taxpayerNumber;

    private String industry;

    private String country;

    private String city;

    private String position;

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}