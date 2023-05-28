package ru.bunkov.calculation.service.accounting.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.accounting.Form;

import java.math.BigDecimal;

@Value
@Builder
public class CreateAccountingArgument {

    Form organizationalAndLegalForm;

    BigDecimal generalTaxationSystemMin;

    BigDecimal generalTaxationSystemMax;

    BigDecimal simplifiedTaxationSystemMin;

    BigDecimal simplifiedTaxationSystemMax;

    BigDecimal patentMin;

    BigDecimal patentMax;
}
