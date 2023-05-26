package ru.bunkov.calculation.service.detail;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.bunkov.calculation.exception.NotFoundException;
import ru.bunkov.calculation.repository.CustomUserRepository;

@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final CustomUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByEmail(username)
                         .orElseThrow(() -> new NotFoundException("User with this id is not found -" + username, null));
    }
}
