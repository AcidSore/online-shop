package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import persist.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String username);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
