package ru.bunkov.calculation.service.calculation;

import ru.bunkov.calculation.model.calculation.Calculation;
import ru.bunkov.calculation.service.calculation.argument.CreateCalculationArgument;

import java.util.UUID;

public interface CalculationService {

    Calculation getExisting(UUID id);

    Calculation create(CreateCalculationArgument argument);
}
