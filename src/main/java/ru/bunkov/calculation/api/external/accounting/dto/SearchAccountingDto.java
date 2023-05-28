package ru.bunkov.calculation.api.external.accounting.dto;

import lombok.Data;
import ru.bunkov.calculation.model.accounting.Form;

import java.math.BigDecimal;

@Data
public class SearchAccountingDto {

    private Form organizationalLegalForm;

    private BigDecimal generalTaxationSystemMin;

    private BigDecimal generalTaxationSystemMax;

    private BigDecimal simplifiedTaxationSystemMin;

    private BigDecimal simplifiedTaxationSystemMax;

    private BigDecimal patentMin;

    private BigDecimal patentMax;
}
