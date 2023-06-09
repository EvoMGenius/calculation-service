package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.BuildingCost;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface BuildingCostRepository extends JpaRepository<BuildingCost, UUID>, QuerydslPredicateExecutor<BuildingCost> {
    List<BuildingCost> findAllByIdIn(Set<UUID> buildingCostIds);
}
