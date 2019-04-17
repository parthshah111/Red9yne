package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface LateFeeRepository extends CrudRepository<LateFeeEntity,Integer> {
    @Query(value = "SELECT * FROM Late_Fee",nativeQuery = true)
    public ArrayList<LateFeeEntity> getLateFee();
}
