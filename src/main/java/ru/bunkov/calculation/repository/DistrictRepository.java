package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.district.District;

import java.util.UUID;

public interface DistrictRepository extends JpaRepository<District, UUID>, QuerydslPredicateExecutor<District> {
}
