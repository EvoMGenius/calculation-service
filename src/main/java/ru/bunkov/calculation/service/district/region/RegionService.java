package ru.bunkov.calculation.service.district.region;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.district.Region;
import ru.bunkov.calculation.service.district.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.district.region.argument.SearchRegionArgument;

import java.util.List;
import java.util.UUID;

public interface RegionService {

    Region getExisting(UUID id);

    List<Region> getList(SearchRegionArgument argument, Sort sort);

    Region create(CreateRegionArgument argument);
}
