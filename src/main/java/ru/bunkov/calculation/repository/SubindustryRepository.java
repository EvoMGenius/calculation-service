package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.industry.Subindustry;

import java.util.UUID;

public interface SubindustryRepository extends JpaRepository<Subindustry, UUID>, QuerydslPredicateExecutor<Subindustry> {
}
