package ru.bunkov.calculation.service.calculation.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.calculation.TaxAndSalary;
import ru.bunkov.calculation.model.calculation.capitalinvestment.CapitalInvestments;
import ru.bunkov.calculation.model.calculation.openingproductioncost.CostsOfOpeningProduction;

@Value
@Builder
public class CreateCalculationArgument {

    CapitalInvestments capitalInvestments;

    CostsOfOpeningProduction costsOfOpeningProduction;

    TaxAndSalary taxAndSalary;

    Accounting accounting;

    Double totalCostMinOfAll;

    Double totalCostMaxOfAll;
}
