package ru.bunkov.calculation.service.user;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.model.user.CustomUser;
import ru.bunkov.calculation.model.user.QCustomUser;
import ru.bunkov.calculation.model.user.Role;
import ru.bunkov.calculation.repository.CustomUserRepository;
import ru.bunkov.calculation.service.user.argument.CreateUserArgument;

import java.util.ArrayList;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomUserServiceImpl implements CustomUserService {

    private final CustomUserRepository repository;

    private final QCustomUser qUser = QCustomUser.customUser;

    @Override
    @Transactional(readOnly = true)
    public CustomUser getExisting(@NonNull UUID id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("User with this id is not found", id));
    }

    @Override
    @Transactional
    public CustomUser create(@NonNull CreateUserArgument argument) {
        return repository.save(CustomUser.builder()
                                         .lastName(argument.getLastName())
                                         .firstName(argument.getFirstName())
                                         .middleName(argument.getMiddleName())
                                         .taxpayerNumber(argument.getTaxpayerNumber())
                                         .industry(argument.getIndustry())
                                         .city(argument.getCity())
                                         .country(argument.getCountry())
                                         .position(argument.getPosition())
                                         .calculations(new ArrayList<>())
                                         .email(argument.getEmail())
                                         .role(Role.USER)
                                         .password(argument.getPassword())
                                         .build());
    }

    @Override
    @Transactional(readOnly = true)
    public CustomUser findByEmail(@NonNull String email) {
        return repository.findByEmail(email).orElseThrow(() -> new NotFoundException("User is not found"));
    }
}