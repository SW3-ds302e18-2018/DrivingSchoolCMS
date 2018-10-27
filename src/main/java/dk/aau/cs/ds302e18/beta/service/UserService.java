package dk.aau.cs.ds302e18.beta.service;

import dk.aau.cs.ds302e18.beta.model.User;
import dk.aau.cs.ds302e18.beta.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
