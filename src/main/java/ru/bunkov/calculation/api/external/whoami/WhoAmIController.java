package ru.bunkov.calculation.api.external.whoami;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bunkov.calculation.action.whoami.WhoAmIAction;
import ru.bunkov.calculation.api.external.whoami.mapper.WhoAmIMapper;
import ru.bunkov.calculation.api.external.whoami.dto.WhoAmIDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/whoami")
public class WhoAmIController {

    private final WhoAmIAction whoAmIAction;

    @GetMapping
    public WhoAmIDto whoami() {
        return WhoAmIMapper.WHO_AM_I_MAPPER.toWhoAmIDto(whoAmIAction.execute());
    }
}
