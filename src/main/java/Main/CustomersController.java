package Main;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;
@Component
public class CustomersController implements Initializable {
    @Autowired
    public CustomerEntityRepository customerEntityRepository;


    @FXML private TableView<CustomerEntity> tableView;
    @FXML private TableColumn<CustomerEntity, Float> customerNumber;
    @FXML private TableColumn<CustomerEntity, String>  CustomerFName;
    @FXML private TableColumn<CustomerEntity, String> CustomerLName;
    @FXML private TableColumn<CustomerEntity, String> address;
    @FXML private TableColumn<CustomerEntity, String> city;
    @FXML private TableColumn<CustomerEntity, String> state;
    @FXML private TableColumn<CustomerEntity, String> phone;
    @FXML private TableColumn<CustomerEntity, String> altphone;
    @FXML private TableColumn<CustomerEntity, String> email;

    private Scene returnScene;
    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
    }

    public void initColumns(){

        customerNumber.setCellValueFactory(new PropertyValueFactory<>("customerId"));

        CustomerFName.setCellValueFactory(new PropertyValueFactory<>("customerFname"));
        CustomerLName.setCellValueFactory(new PropertyValueFactory<>("customerLname"));
        address.setCellValueFactory(new PropertyValueFactory<>("customerAddress"));
        city.setCellValueFactory(new PropertyValueFactory<>("customerCity"));
        state.setCellValueFactory(new PropertyValueFactory<>("customerState"));
        phone.setCellValueFactory(new PropertyValueFactory<>("customerPhone"));
        altphone.setCellValueFactory(new PropertyValueFactory<>("customerAltcontact"));
        email.setCellValueFactory(new PropertyValueFactory<>("customerEmail"));

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

        customerEntityRepository.getAllCustomers().forEach(x->{
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
