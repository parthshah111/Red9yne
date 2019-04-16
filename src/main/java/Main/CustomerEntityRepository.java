package Main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerEntityRepository extends CrudRepository<CustomerEntity,Integer> {

    @Query(value = "SELECT * FROM Customer",nativeQuery = true)
    public ArrayList<CustomerEntity> getAllCustomers();
}
