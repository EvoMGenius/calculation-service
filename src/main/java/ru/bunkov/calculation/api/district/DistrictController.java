package ru.bunkov.calculation.api.district;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;
import ru.bunkov.calculation.action.district.CreateDistrictAction;
import ru.bunkov.calculation.action.district.CreateDistrictActionArgument;
import ru.bunkov.calculation.api.district.dto.CreateDistrictDto;
import ru.bunkov.calculation.api.district.dto.DistrictDto;
import ru.bunkov.calculation.api.district.dto.SearchDistrictDto;
import ru.bunkov.calculation.service.district.DistrictService;
import ru.bunkov.calculation.service.district.argument.SearchDistrictArgument;

import java.util.List;
import java.util.stream.Collectors;

import static ru.bunkov.calculation.api.district.mapper.DistrictMapper.DISTRICT_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/district")
public class DistrictController {

    private final DistrictService districtService;

    private final CreateDistrictAction createDistrictAction;

    @GetMapping("list")
    public List<DistrictDto> getList(SearchDistrictDto dto,
                                     @SortDefault(value = {"district"}, direction = Sort.Direction.ASC)
                                     Sort sort) {
        SearchDistrictArgument argument = DISTRICT_MAPPER.toSearchArgument(dto);

        return districtService.getList(argument, sort).stream()
                              .map(DISTRICT_MAPPER::toDto)
                              .collect(Collectors.toList());
    }

    @PostMapping("create")
    public DistrictDto create(@RequestBody CreateDistrictDto dto) {
        CreateDistrictActionArgument argument = DISTRICT_MAPPER.toCreateActionArgument(dto);

        return DISTRICT_MAPPER.toDto(createDistrictAction.execute(argument));
    }
}
