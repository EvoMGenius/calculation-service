package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.accounting.Accounting;

import java.util.UUID;

public interface AccountingRepository extends JpaRepository<Accounting, UUID>, QuerydslPredicateExecutor<Accounting> {
}
