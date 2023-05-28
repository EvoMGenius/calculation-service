package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.calculation.Calculation;

import java.util.UUID;

public interface CalculationRepository extends JpaRepository<Calculation, UUID>, QuerydslPredicateExecutor<Calculation> {
}
