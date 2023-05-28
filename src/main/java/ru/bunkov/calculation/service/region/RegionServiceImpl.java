package ru.bunkov.calculation.service.region;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.region.QRegion;
import ru.bunkov.calculation.model.region.Region;
import ru.bunkov.calculation.repository.RegionRepository;
import ru.bunkov.calculation.service.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.region.argument.SearchRegionArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

    private final RegionRepository repository;

    private final QRegion qRegion = QRegion.region;

    @Override
    @Transactional(readOnly = true)
    public Region getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> getList(SearchRegionArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Region create(CreateRegionArgument argument) {
        return repository.save(Region.builder()
                                     .name(argument.getName())
                                     .landLease(argument.getLandLease())
                                     .purchaseLand(argument.getPurchaseLand())
                                     .rentRoomMin(argument.getRentRoomMin())
                                     .rentRoomMax(argument.getRentRoomMax())
                                     .build());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAllByNameIn(List<String> regionNames) {
        return repository.findAllByNameIn(regionNames);
    }

    private Predicate buildPredicate(SearchRegionArgument argument) {
        return QPredicates.builder()
                          .add(argument.getName(), qRegion.name::containsIgnoreCase)
                          .buildAnd();
    }
}
