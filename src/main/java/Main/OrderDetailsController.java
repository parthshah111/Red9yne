package Main;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class OrderDetailsController implements Initializable {
    public void setReturnScene(Scene returnScene) {
        this.returnScene = returnScene;
    }

    private Scene returnScene;

    @Autowired
    public OrderEntityRepository orderEntityRepository;
    @Autowired
    public OrderStatusEntityRepository orderStatusEntityRepository;

    @FXML private TableView<OrderTableEntity> tableView;
    @FXML private TableView<OrderStatusEntity> tableViewForStatus;
    @FXML private TableColumn<OrderTableEntity, Float> OrderID;
    @FXML private TableColumn<OrderTableEntity, String>  food;
    @FXML private TableColumn<OrderTableEntity, String> drink;
    @FXML private TableColumn<OrderTableEntity, String> dessert;
    @FXML private TableColumn<OrderTableEntity, String> delivery;
    @FXML private TableColumn<OrderTableEntity, String> lateFee;

//
//    private Scene returnScene;
//    public void setReturnScene(Scene scene) {
//        this.returnScene = scene;
//    }


    @FXML private Button backtoMM;

    @FXML
    void backtoMM(ActionEvent event) {
        if (returnScene == null) {
            backtoMM.getScene().getWindow().hide();
        } else {
            ((Stage) backtoMM.getScene().getWindow()).setScene(returnScene);
        }
    }
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
    }

    public void initColumns(){

        OrderID.setCellValueFactory(new PropertyValueFactory<>("orderNo"));
//        food.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getMenuTotalEntity(), "foodQty"));
        drink.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDrinkMenuEntity(), "drinkTotal"));
        dessert.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDessertMenuEntity(), "dessertTotal"));
        delivery.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getDeliveryEntity(), "deliveryFee"));
        lateFee.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getLateFeeEntity(), "rentalId"));

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

    public void populateTable ()
    {


//         productEntity = new ProductEntity();
//        productEntity.setProductname(productname);
//        productEntity.setProductdesc(Description);
//
//        JobEntity jobEntity =tblView.getSelectionModel().getSelectedItem();
//        jobEntity.setProductEntity(productEntity);
//
//        productRepository.save(productEntity);
//        jobRepository.save(jobEntity);

        orderEntityRepository.getAllOrdersByOrderNo().forEach(x->{
            tableView.getItems().add(x);
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableViewForStatus.getItems().add(x);
//        });
        });

    }



//    public void populateTable ()
//    {
////        int orderID;
////        OrderEntity order = new OrderEntity();
////        order.getOrderNo();
//        orderEntityRepository.getAllOrdersByOrderNo()
//                .forEach(x ->{
//                    tableView.getItems().add(x);
//
//                });
//    }
//
//    @Override public void initialize(URL url, ResourceBundle rb) {
//        OrderID.setCellValueFactory(new PropertyValueFactory<>("orderTotal"));
////        CustomerName.setCellValueFactory(new PropertyValueFactory<>("customerFname"));
////        OrderType.setCellValueFactory(new PropertyValueFactory<>("orderDesc"));
//
////        this.componentButton.setDisable(true);
//        populateTable();
//    }
//
//    public void backButton(ActionEvent event) throws IOException
//    {
//        Parent tableViewParent = FXMLLoader.load(getClass().getResource("main.fxml"));
//        Scene tableViewScene = new Scene(tableViewParent);
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//        window.setScene(tableViewScene);
//        window.show();
//    }
}
