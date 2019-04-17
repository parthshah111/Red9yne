package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EventStatusRepository extends CrudRepository<EventStatusEntity,Integer> {
    @Query(value = "SELECT * FROM Event_Status",nativeQuery = true)
    public ArrayList<EventStatusEntity> getAllStatus();
}
