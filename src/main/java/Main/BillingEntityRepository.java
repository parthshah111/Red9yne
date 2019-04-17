package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BillingEntityRepository extends CrudRepository<BillingIdEntity,Integer> {

    @Query(value = "SELECT * FROM Billing_ID",nativeQuery = true)
    public ArrayList<BillingIdEntity> getAllBilling();
}
