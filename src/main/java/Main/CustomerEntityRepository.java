package Main;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

public interface CustomerEntityRepository extends CrudRepository<CustomerEntity, Integer> {

    @Query(value = "SELECT * FROM Customer",nativeQuery = true)
    public ArrayList<CustomerEntity> getAllCustomers();

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM CustomerEntity e where e.customerFname=?1")
    void deletUsersByFirstName(String firstname);
}
