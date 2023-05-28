package ru.bunkov.calculation.security;

import lombok.NonNull;
import org.springframework.security.core.userdetails.UserDetails;
import ru.bunkov.calculation.api.external.auth.dto.AuthRequest;
import ru.bunkov.calculation.api.external.auth.dto.AuthResponse;
import ru.bunkov.calculation.api.external.auth.dto.RegisterRequest;

import java.util.UUID;

public interface AuthService {
    UUID getAuthorizedUserId() throws Exception;

    UserDetails getAuthorizedUserDetails();

    void register(@NonNull RegisterRequest request);

    AuthResponse authenticate(@NonNull AuthRequest request);
}
