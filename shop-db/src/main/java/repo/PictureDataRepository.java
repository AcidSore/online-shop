package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import persist.model.PictureData;

public interface PictureDataRepository extends JpaRepository<PictureData, Long> {
}
