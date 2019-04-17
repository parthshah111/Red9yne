package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface DessertEntityRepository extends CrudRepository<DessertEntity,Integer> {

    @Query(value = "SELECT * FROM Dessert",nativeQuery = true)
    public ArrayList<DessertEntity> getAllDessert();
}
