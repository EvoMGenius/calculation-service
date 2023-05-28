package ru.bunkov.calculation.model.accounting;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    private Form organizationalAndLegalForm;

    private Double generalTaxationSystemMin;

    private Double generalTaxationSystemMax;

    private Double simplifiedTaxationSystemMin;

    private Double simplifiedTaxationSystemMax;

    private Double patentMin;

    private Double patentMax;

}
