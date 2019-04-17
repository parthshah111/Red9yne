package Main;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class LateFeeController implements Initializable {
    @Autowired
    public LateFeeRepository lateFeeRepository;
    @FXML
    private TableView<LateFeeEntity> tableView;

    @FXML
    private TableColumn<LateFeeEntity, Integer> colRentalID;

    @FXML
    private TableColumn<LateFeeEntity, String> colExpDate;

    @FXML
    private TableColumn<LateFeeEntity, String> colRetDate;

    @FXML
    private TableColumn<LateFeeEntity, String> colLateDay;

    @FXML
    private TableColumn<LateFeeEntity, String> colLateFee;

    @FXML
    private TableColumn<LateFeeEntity, String> colLateTotal;

    private Scene returnScene;

    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    @FXML
    void backtoMM(ActionEvent event) {
        var stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(returnScene);
    }
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
    }

    public void initColumns(){
        colRentalID.setCellValueFactory(new PropertyValueFactory<>("rentalId"));
        colExpDate.setCellValueFactory(new PropertyValueFactory<>("rentalExp"));
        colRetDate.setCellValueFactory(new PropertyValueFactory<>("rentalReturn"));
        colLateDay.setCellValueFactory(new PropertyValueFactory<>("lateDay"));
        colLateFee.setCellValueFactory(new PropertyValueFactory<>("lateFee"));
        colLateTotal.setCellValueFactory(new PropertyValueFactory<>("lateTotal"));

//        OrderID.setCellValueFactory(new PropertyValueFactory<>("orderNo"));
////        food.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getMenuTotalEntity(), "foodQty"));
//        drink.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDrinkMenuEntity().getDrinkEntity(), "drinkName"));
//        dessert.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDessertMenuEntity().getDessertEntity(), "dessertName"));
//        delivery.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDeliveryEntity(), "deliveryFee"));
//        lateFee.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getLateFeeEntity(), "rentalId"));

//        OrderTableEntity customerID = new OrderTableEntity();
//        customerID.getCustomerEntity().getCustomerId()
//        int id = customerID.getCustomerEntity().getCustomerId();
//        //OrderType.setCellValueFactory(new PropertyValueFactory<>("customerEntity"));
//        CustomerFName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerFname"));
//        CustomerLName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerLname"));
//        orderStatus.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getOrderStatusEntity(), "orderDesc"));
//        orderTotal.setCellValueFactory(new PropertyValueFactory<>("orderTotal"));

    }



//    public void populateTable1 ()
//    {
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableView.getItems().add(x);
//        });
//    }

    public void populateTable () {

    lateFeeRepository.getLateFee().forEach(x->{
        tableView.getItems().add(x);
    });

    }
}
