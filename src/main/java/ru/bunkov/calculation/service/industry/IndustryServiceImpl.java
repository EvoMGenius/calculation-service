package ru.bunkov.calculation.service.industry;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.model.industry.QIndustry;
import ru.bunkov.calculation.repository.IndustryRepository;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IndustryServiceImpl implements IndustryService {

    private final IndustryRepository repository;

    private final QIndustry qIndustry = QIndustry.industry;

    @Override
    public Industry getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
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
    public Industry create(CreateIndustryArgument argument) {
        return repository.save(Industry.builder()
                                       .name(argument.getName())
                                       .subindustry(argument.getSubindustry())
                                       .build());
    }
}
