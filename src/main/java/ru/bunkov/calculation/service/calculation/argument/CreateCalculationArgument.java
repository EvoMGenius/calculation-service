package ru.bunkov.calculation.service.calculation.argument;

import lombok.Builder;
import lombok.Value;
import ru.bunkov.calculation.model.accounting.Accounting;
import ru.bunkov.calculation.model.calculation.Expenses;
import ru.bunkov.calculation.model.calculation.capitalinvestment.CapitalInvestments;
import ru.bunkov.calculation.model.calculation.openingproductioncost.CostsOfOpeningProduction;

import java.math.BigDecimal;
import java.util.List;

@Value
@Builder
public class CreateCalculationArgument {

    CapitalInvestments capitalInvestments;

    CostsOfOpeningProduction costsOfOpeningProduction;

    Expenses expenses;

    BigDecimal accountingCost;

    BigDecimal initialExpenses;

    BigDecimal totalCostMinOfAll;

    BigDecimal totalCostMaxOfAll;

    List<String> otherNeeds;
}
