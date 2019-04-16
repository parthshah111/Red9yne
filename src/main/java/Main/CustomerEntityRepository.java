package Main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity,Integer> {

    @Query(value = "SELECT * FROM Customer",nativeQuery = true)
    public ArrayList<CustomerEntity> getAllCustomers();
}
