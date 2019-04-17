package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface StaffTitleEntityRepository extends CrudRepository<StaffTitleEntity,Integer> {

    @Query(value = "SELECT * FROM StaffTitle",nativeQuery = true)
    public ArrayList<StaffTitleEntity> getAllStaffTitle();
}
