package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MenuTotalRepository extends CrudRepository<MenuTotalEntity,Integer> {

    @Query(value = "SELECT * FROM Menu_Total",nativeQuery = true)
    public ArrayList<MenuTotalEntity> getAllMenuTotal();
}
