package Main;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class AppointmentCustomerController implements Initializable {

    public void setReturnScene(Scene returnScene) {
        this.returnScene = returnScene;
    }

    private Scene returnScene;

    @Autowired
    public ApppointmentCustomerEntityRepository apppointmentCustomerEntityRepository;

    @FXML
    private TableView<AppointmentCustomerEntity> tableView;
    @FXML private TableView<AppointmentCustomerEntity> tableViewForStatus;
    @FXML private TableColumn<AppointmentCustomerEntity, Float> appointmentId;
    @FXML private TableColumn<AppointmentCustomerEntity, String>  CustomerFName;
    @FXML private TableColumn<AppointmentCustomerEntity, String> CustomerLName;
    @FXML private TableColumn<AppointmentCustomerEntity, String> appointmentDate;
    @FXML private TableColumn<AppointmentCustomerEntity, String> appointmentStatus;


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

        appointmentId.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getAppointmentEntity(), "appointmentId"));
        CustomerFName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerFname"));
        CustomerLName.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getCustomerEntity(), "customerLname"));
        appointmentDate.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getAppointmentEntity(), "appointmentDate"));
        appointmentStatus.setCellValueFactory(cellData -> Bindings.select(cellData.getValue().getAppointmentEntity().getAppointmentStatusEntity(), "appointmentStatus"));

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

        apppointmentCustomerEntityRepository.getAllAppointmentCustomer().forEach(x->{
            tableView.getItems().add(x);
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableViewForStatus.getItems().add(x);
//        });
        });

    }

}
