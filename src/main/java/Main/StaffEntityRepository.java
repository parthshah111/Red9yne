package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface StaffEntityRepository extends CrudRepository<StaffEntity,Integer> {

@Query(value = "SELECT * FROM Staff",nativeQuery = true)
public ArrayList<StaffEntity> getAllStaff();
}
