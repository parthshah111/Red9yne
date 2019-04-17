package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EventEntityRepository extends CrudRepository<EventEntity,Integer> {

    @Query(value = "SELECT * FROM Event",nativeQuery = true)
    public ArrayList<EventEntity> getAllEvent();
}
