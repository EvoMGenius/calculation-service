package ru.bunkov.calculation.service.user;

import lombok.NonNull;
import ru.bunkov.calculation.model.user.CustomUser;
import ru.bunkov.calculation.service.user.argument.CreateUserArgument;

import java.util.UUID;

public interface CustomUserService {

    CustomUser getExisting(@NonNull UUID id);

    CustomUser create(@NonNull CreateUserArgument argument);

     CustomUser findByEmail(@NonNull String email);
}
