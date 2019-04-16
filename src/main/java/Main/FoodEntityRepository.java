//package Main;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.ArrayList;
//
//public interface FoodEntityRepository  extends JpaRepository<FoodEntity,Integer> {
//
//    @Query(value = "SELECT * FROM Food",nativeQuery = true)
//    public ArrayList<FoodEntity> getAllFood();
//}
