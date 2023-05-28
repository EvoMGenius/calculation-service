package ru.bunkov.calculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.bunkov.calculation.model.Equipment;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface EquipmentRepository extends JpaRepository<Equipment, UUID>, QuerydslPredicateExecutor<Equipment> {
    List<Equipment> findAllByIdIn(Set<UUID> equipmentIds);
}
