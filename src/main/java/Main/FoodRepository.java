package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface FoodRepository extends CrudRepository<FoodEntity,Integer> {
    @Query(value = "SELECT * FROM Food",nativeQuery = true)
    public ArrayList<FoodEntity> getAllFood();
}
