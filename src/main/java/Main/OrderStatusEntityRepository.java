package Main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface OrderStatusEntityRepository extends JpaRepository<OrderStatusEntity,Integer> {

    @Query(value = "SELECT * FROM Order_Status",nativeQuery = true)
    public ArrayList<OrderStatusEntity> getAllOrderStatus();
}
