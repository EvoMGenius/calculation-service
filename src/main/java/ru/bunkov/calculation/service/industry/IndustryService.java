package ru.bunkov.calculation.service.industry;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.industry.Industry;
import ru.bunkov.calculation.service.industry.argument.CreateIndustryArgument;
import ru.bunkov.calculation.service.industry.argument.SearchIndustryArgument;

import java.util.List;
import java.util.UUID;

public interface IndustryService {

    Industry getExisting(UUID id);

    List<Industry> getList(SearchIndustryArgument argument, Sort sort);

    Industry create(CreateIndustryArgument argument);

    Industry upsert(CreateIndustryArgument argument);
}
