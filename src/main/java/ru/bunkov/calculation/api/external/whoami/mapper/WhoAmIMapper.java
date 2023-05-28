package ru.bunkov.calculation.api.external.whoami.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.bunkov.calculation.api.external.whoami.dto.WhoAmIDto;
import ru.bunkov.calculation.model.user.CustomUser;

@Mapper
public interface WhoAmIMapper {
    WhoAmIMapper WHO_AM_I_MAPPER = Mappers.getMapper(WhoAmIMapper.class);

    WhoAmIDto toWhoAmIDto(CustomUser execute);
}
