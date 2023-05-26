package ru.bunkov.calculation.model.industry;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Industry {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany
    private List<Subindustry> subindustry;
}
