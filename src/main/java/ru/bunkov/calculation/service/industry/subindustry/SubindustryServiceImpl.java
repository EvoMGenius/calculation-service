package ru.bunkov.calculation.service.industry.subindustry;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.industry.QSubindustry;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.repository.SubindustryRepository;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;
import ru.bunkov.calculation.util.QPredicates;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SubindustryServiceImpl implements SubindustryService {

    private final SubindustryRepository repository;

    private final QSubindustry qSubindustry = QSubindustry.subindustry;

    @Override
    @Transactional(readOnly = true)
    public Subindustry getExisting(UUID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Subindustry> getList(SearchSubindustryArgument argument, Sort sort) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate, sort));
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
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
                                          .taxSumm2021(argument.getTaxSumm2021())
                                          .taxSumm2022(argument.getTaxSumm2022())
                                          .spendOnHiringStaff2020(argument.getSpendOnHiringStaff2020())
                                          .spendOnHiringStaff2021(argument.getSpendOnHiringStaff2021())
                                          .build());
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Subindustry upsert(CreateSubindustryArgument argument) {
        Optional<Subindustry> byName = repository.findByName(argument.getName());
        if (byName.isPresent()) {
            Subindustry subindustry = byName.get();

            subindustry.setAverageEmployeeCount2020(argument.getAverageEmployeeCount2020());
            subindustry.setAverageEmployeeCount2021(argument.getAverageEmployeeCount2021());
            subindustry.setAverageSalary2020(argument.getAverageSalary2020());
            subindustry.setAverageSalary2021(argument.getAverageSalary2021());
            subindustry.setIncomeTax2021(argument.getIncomeTax2021());
            subindustry.setIncomeTax2022(argument.getIncomeTax2022());
            subindustry.setLandTax2021(argument.getLandTax2021());
            subindustry.setLandTax2022(argument.getLandTax2022());
            subindustry.setPropertyTax2021(argument.getPropertyTax2021());
            subindustry.setPropertyTax2022(argument.getPropertyTax2022());
            subindustry.setTaxToMoscowBudget2021(argument.getTaxToMoscowBudget2021());
            subindustry.setTaxToMoscowBudget2022(argument.getTaxToMoscowBudget2022());
            subindustry.setPersonalIncomeTax2021(argument.getPersonalIncomeTax2021());
            subindustry.setPersonalIncomeTax2022(argument.getPersonalIncomeTax2022());
            subindustry.setTransportTax2021(argument.getTransportTax2021());
            subindustry.setTransportTax2022(argument.getTransportTax2022());
            subindustry.setOtherTax2021(argument.getOtherTax2021());
            subindustry.setOtherTax2022(argument.getOtherTax2022());
            subindustry.setTaxSumm2021(argument.getTaxSumm2021());
            subindustry.setTaxSumm2022(argument.getTaxSumm2022());
            subindustry.setSpendOnHiringStaff2020(argument.getSpendOnHiringStaff2020());
            subindustry.setSpendOnHiringStaff2021(argument.getSpendOnHiringStaff2021());

            return repository.save(subindustry);
        }
        return create(argument);
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
