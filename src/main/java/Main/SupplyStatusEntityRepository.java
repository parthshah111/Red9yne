package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface SupplyStatusEntityRepository extends CrudRepository<SupplyStatusEntity,Integer> {

    @Query(value = "SELECT * FROM Supply_Status",nativeQuery = true)
    public ArrayList<SupplyStatusEntity> getAllSuppliers();


}
