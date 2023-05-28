package ru.bunkov.calculation.service.building;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.BuildingCost;
import ru.bunkov.calculation.service.building.argument.CreateBuildingCostArgument;
import ru.bunkov.calculation.service.building.argument.SearchBuildingCostArgument;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface BuildingCostService {

    BuildingCost getExisting(UUID id);

    List<BuildingCost> getList(SearchBuildingCostArgument argument, Sort sort);

    BuildingCost create(CreateBuildingCostArgument argument);

    List<BuildingCost> findAllByIdsIn(Set<UUID> buildingCostIds);
}
