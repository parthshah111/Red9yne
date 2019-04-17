package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PaymentInformationRepository extends CrudRepository<PaymentInformationEntity,Integer> {

    @Query(value = "SELECT * FROM Payment_Information",nativeQuery = true)
    public ArrayList<PaymentInformationEntity> getAllPaymentInformation();
}
