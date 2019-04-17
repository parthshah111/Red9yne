package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TaxTypeEntityRepository extends CrudRepository<TaxTypeEntity,Integer> {

    @Query(value = "SELECT * FROM Tax_Type",nativeQuery = true)
    public ArrayList<TaxTypeEntity> getAllTaxType();
}
