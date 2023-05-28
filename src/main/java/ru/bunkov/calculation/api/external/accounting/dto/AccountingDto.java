package ru.bunkov.calculation.api.external.accounting.dto;

import lombok.Data;
import ru.bunkov.calculation.model.accounting.Form;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class AccountingDto {

    private UUID id;

    private Form organizationalAndLegalForm;

    private BigDecimal generalTaxationSystemMin;

    private BigDecimal generalTaxationSystemMax;

    private BigDecimal simplifiedTaxationSystemMin;

    private BigDecimal simplifiedTaxationSystemMax;

    private BigDecimal patentMin;

    private BigDecimal patentMax;
}
