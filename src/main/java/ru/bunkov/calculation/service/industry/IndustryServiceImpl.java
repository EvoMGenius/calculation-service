package ru.bunkov.calculation.service.industry;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.model.industry.QIndustry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.repository.IndustryRepository;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IndustryServiceImpl implements IndustryService {

    private final IndustryRepository repository;

    private final QIndustry qIndustry = QIndustry.industry;

    @Override
    @Transactional(readOnly = true)
    public Industry getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Industry> getList(SearchIndustryArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    private Predicate buildPredicate(SearchIndustryArgument argument) {
        return QPredicates.builder()
                          .add(argument.getName(), qIndustry.name::containsIgnoreCase)
                          .buildAnd();
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Industry create(CreateIndustryArgument argument) {
        return repository.save(Industry.builder()
                                       .name(argument.getName())
                                       .subindustry(argument.getSubindustry())
                                       .build());
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Industry upsert(CreateIndustryArgument argument) {
        Optional<Industry> byName = repository.findByName(argument.getName());

        if (byName.isPresent()) {
            Industry industry = byName.get();
            List<Subindustry> subindustry = industry.getSubindustry();
            if (argument.getSubindustry().size() == 1 &&
                subindustry.contains((Subindustry) argument.getSubindustry()
                                                           .stream()
                                                           .findFirst()
                                                           .get())) {
                return industry;
            }
            subindustry.addAll(argument.getSubindustry());
            industry.setSubindustry(subindustry);
            return repository.save(industry);
        }
        return create(argument);
    }
}
