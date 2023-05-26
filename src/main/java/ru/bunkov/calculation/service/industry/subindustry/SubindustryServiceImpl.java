package ru.bunkov.calculation.service.industry.subindustry;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.industry.QSubindustry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.repository.SubindustryRepository;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SubindustryServiceImpl implements SubindustryService {

    private final SubindustryRepository repository;

    private final QSubindustry qSubindustry = QSubindustry.subindustry;

    @Override
    public Subindustry getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Subindustry> getList(SearchSubindustryArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    public Subindustry create(CreateSubindustryArgument argument) {
        return repository.save(Subindustry.builder()
                                          .name(argument.getName())
                                          .averageEmployeeCount2020(argument.getAverageEmployeeCount2020())
                                          .averageEmployeeCount2021(argument.getAverageEmployeeCount2021())
                                          .averageSalary2020(argument.getAverageSalary2020())
                                          .averageSalary2021(argument.getAverageSalary2021())
                                          .incomeTax2021(argument.getIncomeTax2021())
                                          .incomeTax2022(argument.getIncomeTax2022())
                                          .landTax2021(argument.getLandTax2021())
                                          .landTax2022(argument.getLandTax2022())
                                          .propertyTax2021(argument.getPropertyTax2021())
                                          .propertyTax2022(argument.getPropertyTax2022())
                                          .taxToMoscowBudget2021(argument.getTaxToMoscowBudget2021())
                                          .taxToMoscowBudget2022(argument.getTaxToMoscowBudget2022())
                                          .personalIncomeTax2021(argument.getPersonalIncomeTax2021())
                                          .personalIncomeTax2022(argument.getPersonalIncomeTax2022())
                                          .transportTax2021(argument.getTransportTax2021())
                                          .transportTax2022(argument.getTransportTax2022())
                                          .otherTax2021(argument.getOtherTax2021())
                                          .otherTax2022(argument.getOtherTax2022())
                                          .build());
    }

    private Predicate buildPredicate(SearchSubindustryArgument argument) {
        return QPredicates.builder()
                          .add(argument.getName(), qSubindustry.name::containsIgnoreCase)
                          .add(argument.getAverageEmployeeCount2020(), qSubindustry.averageEmployeeCount2020::eq)
                          .add(argument.getAverageEmployeeCount2021(), qSubindustry.averageEmployeeCount2021::eq)
                          .add(argument.getAverageSalary2020(), qSubindustry.averageSalary2020::eq)
                          .add(argument.getAverageSalary2021(), qSubindustry.averageSalary2021::eq)
                          .add(argument.getIncomeTax2021(), qSubindustry.incomeTax2021::eq)
                          .add(argument.getIncomeTax2022(), qSubindustry.incomeTax2022::eq)
                          .add(argument.getLandTax2021(), qSubindustry.landTax2021::eq)
                          .add(argument.getLandTax2022(), qSubindustry.landTax2022::eq)
                          .add(argument.getPropertyTax2021(), qSubindustry.propertyTax2021::eq)
                          .add(argument.getPropertyTax2022(), qSubindustry.propertyTax2022::eq)
                          .add(argument.getTaxToMoscowBudget2021(), qSubindustry.taxToMoscowBudget2021::eq)
                          .add(argument.getTaxToMoscowBudget2022(), qSubindustry.taxToMoscowBudget2022::eq)
                          .add(argument.getPersonalIncomeTax2021(), qSubindustry.personalIncomeTax2021::eq)
                          .add(argument.getPersonalIncomeTax2022(), qSubindustry.personalIncomeTax2022::eq)
                          .add(argument.getTransportTax2021(), qSubindustry.transportTax2021::eq)
                          .add(argument.getTransportTax2022(), qSubindustry.transportTax2022::eq)
                          .add(argument.getOtherTax2021(), qSubindustry.otherTax2021::eq)
                          .add(argument.getOtherTax2022(), qSubindustry.otherTax2022::eq)
                          .buildAnd();
    }
}
