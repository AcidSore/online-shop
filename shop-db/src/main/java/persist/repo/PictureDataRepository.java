package persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persist.model.PictureData;
@Repository
public interface PictureDataRepository extends JpaRepository<PictureData, Long> {
}
