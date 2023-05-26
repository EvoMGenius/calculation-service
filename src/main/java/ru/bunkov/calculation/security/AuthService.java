package ru.bunkov.calculation.security;

import lombok.NonNull;
import ru.bunkov.calculation.api.auth.dto.AuthRequest;
import ru.bunkov.calculation.api.auth.dto.AuthResponse;
import ru.bunkov.calculation.api.auth.dto.RegisterRequest;

import java.util.UUID;

public interface AuthService {
    UUID getAuthorizedUserId() throws Exception;

    void register(@NonNull RegisterRequest request);

    AuthResponse authenticate(@NonNull AuthRequest request);
}
