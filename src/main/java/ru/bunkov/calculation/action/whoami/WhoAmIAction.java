package ru.bunkov.calculation.action.whoami;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.bunkov.calculation.model.user.CustomUser;
import ru.bunkov.calculation.security.AuthService;

@Component
@RequiredArgsConstructor
public class WhoAmIAction {

    private final AuthService authService;

    public CustomUser execute() {
        return (CustomUser) authService.getAuthorizedUserDetails();
    }
}
