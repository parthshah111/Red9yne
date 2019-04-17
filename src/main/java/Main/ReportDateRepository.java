package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ReportDateRepository extends CrudRepository<ReportDateEntity,Integer> {
    @Query(value = "SELECT * FROM ReportDate",nativeQuery = true)
    public ArrayList<ReportDateEntity> getAllReport();
}
