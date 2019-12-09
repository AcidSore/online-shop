package persist.repo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import persist.model.User;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String username);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
