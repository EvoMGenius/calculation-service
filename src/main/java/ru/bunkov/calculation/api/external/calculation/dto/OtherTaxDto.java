package ru.bunkov.calculation.api.external.calculation.dto;

import lombok.Data;
import ru.bunkov.calculation.model.calculation.taxandsalary.OtherTax;

import java.math.BigDecimal;

@Data
public class OtherTaxDto {

    private BigDecimal totalOtherTax;

    private BigDecimal landTax;

    private BigDecimal propertyTax;

    private BigDecimal transportTax;

    private BigDecimal otherTax;

    public OtherTaxDto(OtherTax otherTax) {

    }
}
