package wit.seven.bwash.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wit.seven.bwash.dao.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
