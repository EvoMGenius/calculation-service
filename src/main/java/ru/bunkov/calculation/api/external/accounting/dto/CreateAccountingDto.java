package ru.bunkov.calculation.api.external.accounting.dto;

import lombok.Data;
import ru.bunkov.calculation.model.accounting.Form;

@Data
public class CreateAccountingDto {

    private Form organizationalAndLegalForm;

    private Double generalTaxationSystemMin;

    private Double generalTaxationSystemMax;

    private Double simplifiedTaxationSystemMin;

    private Double simplifiedTaxationSystemMax;

    private Double patentMin;

    private Double patentMax;
}
