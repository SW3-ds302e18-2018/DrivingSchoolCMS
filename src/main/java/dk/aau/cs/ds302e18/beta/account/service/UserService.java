package dk.aau.cs.ds302e18.beta.account.service;

import dk.aau.cs.ds302e18.beta.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
