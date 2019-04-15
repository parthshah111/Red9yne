package Main;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.util.LambdaSafe;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class OrdersController implements Initializable {

    @Autowired
    public OrderEntityRepository orderEntityRepository;
    @Autowired
    public OrderStatusEntityRepository orderStatusEntityRepository;

    @FXML private TextField addJName;
    @FXML private TextField addJDesc;
    @FXML private Button componentButton;
    @FXML private TableView<OrderTableEntity> tableView;
    @FXML private TableView<OrderStatusEntity> tableViewForStatus;
    @FXML private TableColumn<OrderTableEntity, Float> OrderID;
    @FXML private TableColumn<CustomerEntity, String>  CustomerName;
    @FXML private TableColumn<OrderTableEntity, Float> OrderType;

    private Scene returnScene;
    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
    }

    public void initColumns(){

        OrderID.setCellValueFactory(new PropertyValueFactory<>("orderNo"));
//        OrderTableEntity customerID = new OrderTableEntity();
//        customerID.getCustomerEntity().getCustomerId()
//        int id = customerID.getCustomerEntity().getCustomerId();
        OrderType.setCellValueFactory(new PropertyValueFactory<>("customerEntity"));

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