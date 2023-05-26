package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.industry.Industry;

import java.util.UUID;

public interface IndustryRepository extends JpaRepository<Industry, UUID>, QuerydslPredicateExecutor<Industry> {
}
