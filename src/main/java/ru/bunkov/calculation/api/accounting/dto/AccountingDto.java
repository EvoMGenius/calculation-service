package ru.bunkov.calculation.api.accounting.dto;

import lombok.Data;
import ru.bunkov.calculation.model.accounting.Form;

import java.util.UUID;

@Data
public class AccountingDto {

    private UUID id;

    private Form organizationalAndLegalForm;

    private Double generalTaxationSystem;

    private Double simplifiedTaxationSystem;

    private Double patent;
}
