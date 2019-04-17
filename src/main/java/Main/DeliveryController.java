package Main;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class DeliveryController implements Initializable {

    @Autowired
    public DeliveryEntityRepository deliveryEntityRepository;
    @FXML
    private TableView<DeliveryEntity> tableView;
    @FXML
    private TableColumn<DeliveryEntity, Float> deliveryID;
    @FXML
    private TableColumn<DeliveryEntity, String> deliveryFee;

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

        deliveryID.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        deliveryFee.setCellValueFactory(new PropertyValueFactory<>("deliveryFee"));
    }


    public void populateTable() {


        deliveryEntityRepository.getAllDelivery().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
