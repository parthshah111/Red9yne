package Main;

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
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class OrderStatusController implements Initializable {
    @Autowired
    public OrderStatusEntityRepository orderStatusEntityRepository;
    @FXML
    private TableView<OrderStatusEntity> tableView;
    @FXML
    private TableColumn<OrderStatusEntity, Float> orderStatusID;
    @FXML
    private TableColumn<OrderStatusEntity, String> orderDesc;

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

    public void initColumns() {

        orderStatusID.setCellValueFactory(new PropertyValueFactory<>("orderStatusId"));
        orderDesc.setCellValueFactory(new PropertyValueFactory<>("orderDesc"));


    }


    public void populateTable() {


        orderStatusEntityRepository.getAllOrderStatus().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
