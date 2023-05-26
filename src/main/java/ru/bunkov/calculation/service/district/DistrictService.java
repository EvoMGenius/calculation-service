package ru.bunkov.calculation.service.district;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.district.District;
import ru.bunkov.calculation.service.district.argument.CreateDistrictArgument;
import ru.bunkov.calculation.service.district.argument.SearchDistrictArgument;

import java.util.List;
import java.util.UUID;

public interface DistrictService {

    District getExisting(UUID id);

    List<District> getList(SearchDistrictArgument argument, Sort sort);

    District create(CreateDistrictArgument argument);
}
