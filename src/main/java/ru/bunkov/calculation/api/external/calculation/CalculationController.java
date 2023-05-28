package ru.bunkov.calculation.api.external.calculation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bunkov.calculation.api.external.calculation.dto.CalculationDto;
import ru.bunkov.calculation.api.external.calculation.dto.CreateCalculationDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/calculation")
public class CalculationController {

    @PostMapping("calc")
    public CalculationDto calculate(CreateCalculationDto dto) {

    }
}
