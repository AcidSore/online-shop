package persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persist.model.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
}