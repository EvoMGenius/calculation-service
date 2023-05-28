package ru.bunkov.calculation.service.region;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.region.Region;
import ru.bunkov.calculation.service.region.argument.CreateRegionArgument;
import ru.bunkov.calculation.service.region.argument.SearchRegionArgument;

import java.util.List;
import java.util.UUID;

public interface RegionService {

    Region getExisting(UUID id);

    List<Region> getList(SearchRegionArgument argument, Sort sort);

    Region create(CreateRegionArgument argument);
}
