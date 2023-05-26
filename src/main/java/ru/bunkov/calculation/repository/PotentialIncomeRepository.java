package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.income.PotentialIncome;

import java.util.UUID;

public interface PotentialIncomeRepository extends JpaRepository<PotentialIncome, UUID>, QuerydslPredicateExecutor<PotentialIncome> {
}
