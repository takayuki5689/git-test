package connectdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import connectdb.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
}
