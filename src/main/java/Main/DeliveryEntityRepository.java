package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface DeliveryEntityRepository extends CrudRepository<DeliveryEntity,Integer> {

    @Query(value = "SELECT * FROM Delivery",nativeQuery = true)
    public ArrayList<DeliveryEntity> getAllDelivery();

}
