package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.CapitalBuildingObj;

import java.util.UUID;

public interface CapitalBuildingObjRepository extends JpaRepository<CapitalBuildingObj, UUID>, QuerydslPredicateExecutor<CapitalBuildingObj> {
}
