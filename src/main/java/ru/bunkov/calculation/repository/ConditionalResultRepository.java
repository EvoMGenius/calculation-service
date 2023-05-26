package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.income.ConditionalResult;

import java.util.UUID;

public interface ConditionalResultRepository extends JpaRepository<ConditionalResult, UUID>, QuerydslPredicateExecutor<ConditionalResult> {
}
