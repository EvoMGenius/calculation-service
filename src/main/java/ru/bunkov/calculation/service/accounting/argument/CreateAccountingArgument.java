package ru.bunkov.calculation.service.accounting.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.accounting.Form;

@Value
@Builder
public class CreateAccountingArgument {

    Form organizationalAndLegalForm;

    Double generalTaxationSystem;

    Double simplifiedTaxationSystem;

    Double patent;
}
