package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ApppointmentCustomerEntityRepository extends CrudRepository<AppointmentCustomerEntity,Integer> {

    @Query(value = "SELECT * FROM Appointment_Customer",nativeQuery = true)
    public ArrayList<AppointmentCustomerEntity> getAllAppointmentCustomer();
}
