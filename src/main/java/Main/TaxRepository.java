package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TaxRepository extends CrudRepository<TaxEntity,Integer> {
    @Query(value = "SELECT * FROM Tax",nativeQuery = true)
    public ArrayList<TaxEntity> getAllTax();
}
