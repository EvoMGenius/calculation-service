package ru.bunkov.calculation.service.capitalbuilding;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.CapitalBuildingObj;
import ru.bunkov.calculation.model.QCapitalBuildingObj;
import ru.bunkov.calculation.repository.CapitalBuildingObjRepository;
import ru.bunkov.calculation.service.capitalbuilding.argument.CreateCapitalBuildingObjArgument;
import ru.bunkov.calculation.service.capitalbuilding.argument.SearchCapitalBuildingObjArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CapitalBuildingObjServiceImpl implements CapitalBuildingObjService {

    private final CapitalBuildingObjRepository repository;

    private final QCapitalBuildingObj qCapitalBuildingObj = QCapitalBuildingObj.capitalBuildingObj;

    @Override
    public CapitalBuildingObj getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<CapitalBuildingObj> getList(SearchCapitalBuildingObjArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    private Predicate buildPredicate(SearchCapitalBuildingObjArgument argument) {
        return QPredicates.builder()
                          .add(argument.getType(), qCapitalBuildingObj.type::containsIgnoreCase)
                          .add(argument.getCost(), qCapitalBuildingObj.cost::eq)
                          .buildAnd();
    }

    @Override
    public CapitalBuildingObj create(CreateCapitalBuildingObjArgument argument) {
        return repository.save(CapitalBuildingObj.builder()
                                                 .type(argument.getType())
                                                 .cost(argument.getCost())
                                                 .build());
    }
}
