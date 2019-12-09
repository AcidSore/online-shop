package persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persist.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
