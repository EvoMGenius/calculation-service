package ru.bunkov.calculation.service.capitalbuilding;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.CapitalBuildingObj;
import ru.bunkov.calculation.service.capitalbuilding.argument.CreateCapitalBuildingObjArgument;
import ru.bunkov.calculation.service.capitalbuilding.argument.SearchCapitalBuildingObjArgument;

import java.util.List;
import java.util.UUID;

public interface CapitalBuildingObjService {
    CapitalBuildingObj getExisting(UUID id);

    List<CapitalBuildingObj> getList(SearchCapitalBuildingObjArgument argument, Sort sort);

    CapitalBuildingObj create(CreateCapitalBuildingObjArgument argument);
}
