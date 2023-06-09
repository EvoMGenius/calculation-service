package ru.bunkov.calculation.model.accounting;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Accounting {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Form organizationalLegalForm;

    private BigDecimal generalTaxationSystemMin;

    private BigDecimal generalTaxationSystemMax;

    private BigDecimal simplifiedTaxationSystemMin;

    private BigDecimal simplifiedTaxationSystemMax;

    private BigDecimal patentMin;

    private BigDecimal patentMax;

}
