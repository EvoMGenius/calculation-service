package ru.bunkov.calculation.api.accounting.dto;

import lombok.Data;
import ru.bunkov.calculation.model.accounting.Form;

@Data
public class CreateAccountingDto {

    private Form organizationalAndLegalForm;

    private Double generalTaxationSystem;

    private Double simplifiedTaxationSystem;

    private Double patent;
}
