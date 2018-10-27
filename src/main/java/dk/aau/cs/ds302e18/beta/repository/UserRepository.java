package dk.aau.cs.ds302e18.beta.repository;

import dk.aau.cs.ds302e18.beta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
