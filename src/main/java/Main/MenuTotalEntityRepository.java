package Main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface MenuTotalEntityRepository extends JpaRepository<MenuTotalEntity,Integer> {

    @Query(value = "SELECT * FROM Menu_Total",nativeQuery = true)
    public ArrayList<MenuTotalEntity> getAllFood();
}
