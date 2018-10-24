package dk.aau.cs.ds302e18.beta.account.repository;

import dk.aau.cs.ds302e18.beta.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
