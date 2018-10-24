package dk.aau.cs.ds302e18.beta.account.repository;

import dk.aau.cs.ds302e18.beta.account.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
