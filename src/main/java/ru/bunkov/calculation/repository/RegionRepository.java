package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.district.Region;

import java.util.UUID;

public interface RegionRepository extends JpaRepository<Region, UUID>, QuerydslPredicateExecutor<Region> {
}
