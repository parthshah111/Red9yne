package Main;

import javafx.beans.value.ObservableValue;
import javafx.beans.binding.Bindings;
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

    @FXML private TableView<OrderTableEntity> tableView;
    @FXML private TableView<OrderStatusEntity> tableViewForStatus;
    @FXML private TableColumn<OrderTableEntity, Float> OrderID;
    @FXML private TableColumn<OrderTableEntity, String>  CustomerFName;
    @FXML private TableColumn<OrderTableEntity, String> CustomerLName;
    @FXML private TableColumn<OrderTableEntity, String> orderStatus;
    @FXML private TableColumn<OrderTableEntity, String> orderTotal;

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
        //OrderType.setCellValueFactory(new PropertyValueFactory<>("customerEntity"));
        CustomerFName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerFname"));
        CustomerLName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerLname"));
        orderStatus.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getOrderStatusEntity(), "orderDesc"));
        orderTotal.setCellValueFactory(new PropertyValueFactory<>("orderTotal"));
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


}
