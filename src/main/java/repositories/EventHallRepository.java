package repositories;

import entities.EventHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventHallRepository extends JpaRepository<EventHall, Long> {

}
