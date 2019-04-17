package Main;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

public interface DessertEntityRepository extends CrudRepository<DessertEntity,Integer> {

    @Query(value = "SELECT * FROM Dessert",nativeQuery = true)
    public ArrayList<DessertEntity> getAllDessert();

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM DessertEntity e where e.dessertName=?1")
    void deleteDessertEntitiesByDessertName(String name);
}
