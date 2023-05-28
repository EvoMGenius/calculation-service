package ru.bunkov.calculation.service.equipment;

import org.springframework.data.domain.Sort;
import ru.bunkov.calculation.model.Equipment;
import ru.bunkov.calculation.service.equipment.argument.CreateEquipmentArgument;
import ru.bunkov.calculation.service.equipment.argument.SearchEquipmentArgument;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface EquipmentService {

    Equipment getExisting(UUID id);

    List<Equipment> getList(SearchEquipmentArgument argument, Sort sort);

    Equipment create(CreateEquipmentArgument argument);

    List<Equipment> findAllByIdIn(Set<UUID> equipmentIds);
}
