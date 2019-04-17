package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ManagerNoteRepository extends CrudRepository<ManagerNoteEntity,Integer> {

    @Query(value = "SELECT * FROM Manager_Note",nativeQuery = true)
    public ArrayList<ManagerNoteEntity> getAllManagerNote();
}
