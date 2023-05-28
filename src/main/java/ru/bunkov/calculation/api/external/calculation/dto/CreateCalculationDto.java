package ru.bunkov.calculation.api.external.calculation.dto;

import lombok.Data;
import ru.bunkov.calculation.util.Tuple;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Data
public class CreateCalculationDto {
    @NotBlank
    private String organizationalAndLegalForm;

    @NotBlank
    private String taxationSystemType;

    @NotNull
    private UUID industryId;

    private UUID subindustryId;

    private UUID potentialIncomeId;

    @NotEmpty
    private List<String> regionNames;

    @NotNull
    private Double areaOnRegions;

    private List<Tuple<UUID, Double>> buildingCostIdAndAreaPairList;

    private List<Tuple<UUID, Double>> otherCapitalBuildingCostIdAndAreaPairList;

    private List<Tuple<UUID, Integer>> equipmentIdAndCountPairList;

    private List<Tuple<UUID, Integer>> customEquipmentIdAndCountPairList;

    @NotNull
    private Double staffCount;

    private Double averageSalary;

    private boolean isUsingAccountingService;

    private List<String> otherNeeds;
}
