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

    private Double generalTaxationSystem;

    private Double simplifiedTaxationSystem;

    private Double patent;

}
