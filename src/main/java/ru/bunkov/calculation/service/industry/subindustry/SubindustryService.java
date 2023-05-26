package ru.bunkov.calculation.service.industry.subindustry;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.industry.Subindustry;
import ru.bunkov.calculation.service.industry.subindustry.argument.CreateSubindustryArgument;
import ru.bunkov.calculation.service.industry.subindustry.argument.SearchSubindustryArgument;

import java.util.List;
import java.util.UUID;

public interface SubindustryService {

    Subindustry getExisting(UUID id);

    List<Subindustry> getList(SearchSubindustryArgument argument, Sort sort);

    Subindustry create(CreateSubindustryArgument argument);
}
