package Main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface OrderEntityRepository extends CrudRepository<OrderTableEntity,Integer> {
    @Query(value = "SELECT * FROM Order_Table",nativeQuery = true)
    public ArrayList<OrderTableEntity> getAllOrdersByOrderNo();
}