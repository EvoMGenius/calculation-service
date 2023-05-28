package ru.bunkov.calculation.service.equipment;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.Equipment;
import ru.bunkov.calculation.model.QEquipment;
import ru.bunkov.calculation.repository.EquipmentRepository;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository repository;

    private final QEquipment qEquipment = QEquipment.equipment;

    @Override
    @Transactional(readOnly = true)
    public Equipment getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Equipment> getList(SearchEquipmentArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Equipment create(CreateEquipmentArgument argument) {
        return repository.save(Equipment.builder()
                                        .equipmentType(argument.getEquipmentType())
                                        .averageCost(argument.getAverageCost())
                                        .build());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Equipment> findAllByIdIn(Set<UUID> equipmentIds) {
        return repository.findAllByIdIn(equipmentIds);
    }

    private Predicate buildPredicate(SearchEquipmentArgument argument) {
        return QPredicates.builder()
                          .add(argument.getEquipmentType(), qEquipment.equipmentType::containsIgnoreCase)
                          .add(argument.getAverageCost(), qEquipment.averageCost::eq)
                          .buildAnd();
    }
}
