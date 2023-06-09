package ru.bunkov.calculation.service.building;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.BuildingCost;
import ru.bunkov.calculation.model.QBuildingCost;
import ru.bunkov.calculation.repository.BuildingCostRepository;
import ru.bunkov.calculation.service.building.argument.CreateBuildingCostArgument;
import ru.bunkov.calculation.service.building.argument.SearchBuildingCostArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BuildingCostServiceImpl implements BuildingCostService {

    private final BuildingCostRepository repository;

    private final QBuildingCost qBuildingCost = QBuildingCost.buildingCost;

    @Override
    @Transactional(readOnly = true)
    public BuildingCost getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BuildingCost> getList(SearchBuildingCostArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    private Predicate buildPredicate(SearchBuildingCostArgument argument) {
        return QPredicates.builder()
                          .add(argument.getType(), qBuildingCost.type::containsIgnoreCase)
                          .add(argument.getCost(), qBuildingCost.cost::eq)
                          .buildAnd();
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public BuildingCost create(CreateBuildingCostArgument argument) {
        return repository.save(BuildingCost.builder()
                                           .type(argument.getType())
                                           .cost(argument.getCost())
                                           .build());
    }

    @Override
    @Transactional(readOnly = true)
    public List<BuildingCost> findAllByIdsIn(Set<UUID> buildingCostIds) {
        return repository.findAllByIdIn(buildingCostIds);
    }
}
