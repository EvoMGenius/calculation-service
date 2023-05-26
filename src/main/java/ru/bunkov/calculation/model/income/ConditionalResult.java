package ru.bunkov.calculation.model.income;

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
public class ConditionalResult {

    @Id
    @GeneratedValue
    private UUID id;


}
