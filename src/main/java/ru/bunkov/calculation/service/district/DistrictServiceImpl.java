package ru.bunkov.calculation.service.district;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.district.District;
import ru.bunkov.calculation.model.district.QDistrict;
import ru.bunkov.calculation.repository.DistrictRepository;
import ru.bunkov.calculation.service.district.argument.CreateDistrictArgument;
import ru.bunkov.calculation.service.district.argument.SearchDistrictArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository repository;

    private final QDistrict qDistrict = QDistrict.district1;

    @Override
    @Transactional(readOnly = true)
    public District getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<District> getList(SearchDistrictArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public District create(CreateDistrictArgument argument) {
        return repository.save(District.builder()
                                       .district(argument.getDistrict())
                                       .regions(argument.getRegions())
                                       .averageCost(argument.getAverageCost())
                                       .build());
    }

    private Predicate buildPredicate(SearchDistrictArgument argument) {
        return QPredicates.builder()
                          .add(argument.getDistrict(), qDistrict.district::containsIgnoreCase)
                          .add(argument.getAverageCost(), qDistrict.averageCost::eq)
                          .buildAnd();
    }
}
