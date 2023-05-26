package ru.bunkov.calculation.security;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.bunkov.calculation.api.auth.dto.AuthRequest;
import ru.bunkov.calculation.api.auth.dto.AuthResponse;
import ru.bunkov.calculation.api.auth.dto.RegisterRequest;
import ru.bunkov.calculation.model.user.CustomUser;
import ru.bunkov.calculation.service.user.CustomUserService;
import ru.bunkov.calculation.service.user.argument.CreateUserArgument;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final CustomUserService service; //todo swap to service

    //todo add customuserdetailservice

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    @Override
    public UUID getAuthorizedUserId() throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser details = (CustomUser) authentication.getPrincipal();
        return details.getId();
    }

    @Override
    public void register(@NonNull RegisterRequest request) {
        CustomUser user = service.create(CreateUserArgument.builder()
                                                           .lastName(request.getLastName())
                                                           .firstName(request.getFirstName())
                                                           .middleName(request.getMiddleName())
                                                           .taxpayerNumber(request.getTaxpayerNumber())
                                                           .industry(request.getIndustry())
                                                           .city(request.getCity())
                                                           .country(request.getCountry())
                                                           .position(request.getPosition())
                                                           .email(request.getEmail())
                                                           .password(passwordEncoder.encode(request.getPassword()))
                                                           .build());
    }

    @Override
    public AuthResponse authenticate(@NonNull AuthRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = service.findByEmail(request.getEmail());


        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                           .token(jwtToken)
                           .build();
    }
}
