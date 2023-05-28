package ru.bunkov.calculation.api.external.whoami.mapper;

import javax.annotation.Generated;
import ru.bunkov.calculation.api.external.whoami.dto.WhoAmIDto;
import ru.bunkov.calculation.model.user.CustomUser;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-28T06:50:13+1000",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_345 (Temurin)"
)
public class WhoAmIMapperImpl implements WhoAmIMapper {

    @Override
    public WhoAmIDto toWhoAmIDto(CustomUser execute) {
        if ( execute == null ) {
            return null;
        }

        WhoAmIDto whoAmIDto = new WhoAmIDto();

        whoAmIDto.setId( execute.getId() );
        whoAmIDto.setLastName( execute.getLastName() );
        whoAmIDto.setFirstName( execute.getFirstName() );
        whoAmIDto.setMiddleName( execute.getMiddleName() );
        whoAmIDto.setOrganizationName( execute.getOrganizationName() );
        whoAmIDto.setTaxpayerNumber( execute.getTaxpayerNumber() );
        whoAmIDto.setIndustry( execute.getIndustry() );
        whoAmIDto.setCountry( execute.getCountry() );
        whoAmIDto.setCity( execute.getCity() );
        whoAmIDto.setPosition( execute.getPosition() );
        whoAmIDto.setEmail( execute.getEmail() );

        return whoAmIDto;
    }
}
