package Main;

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
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class DessertController implements Initializable {
    @Autowired
    public DessertEntityRepository dessertEntityRepository;


    @FXML
    private TableView<DessertEntity> tableView;
    @FXML private TableColumn<DessertEntity, Float> dessertID;
    @FXML private TableColumn<DessertEntity, String>  dessertName;
    @FXML private TableColumn<DessertEntity, String>  dessertDesc;
    @FXML private TableColumn<DessertEntity, String>  dessertPrice;

    private Scene returnScene;

    @FXML private Button backtoMM;

    @FXML
    void backtoMM(ActionEvent event) {
        if (returnScene == null) {
            backtoMM.getScene().getWindow().hide();
        } else {
            ((Stage) backtoMM.getScene().getWindow()).setScene(returnScene);
        }
    }

    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
    }



    public void initColumns(){

        dessertID.setCellValueFactory(new PropertyValueFactory<>("dessertId"));
        dessertName.setCellValueFactory(new PropertyValueFactory<>("dessertName"));
        dessertDesc.setCellValueFactory(new PropertyValueFactory<>("dessertDesc"));
        dessertPrice.setCellValueFactory(new PropertyValueFactory<>("dessertPrice"));
    }


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

        dessertEntityRepository.getAllDessert().forEach(x->{
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
}
