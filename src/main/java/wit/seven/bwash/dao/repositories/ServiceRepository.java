package wit.seven.bwash.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wit.seven.bwash.dao.models.Center;

@Repository
public interface ServiceRepository extends JpaRepository<Center, Long> {
}
