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
public class BillingController implements Initializable {


    @Autowired
    public BillingEntityRepository billingEntityRepository;
    @FXML
    private TableView<BillingIdEntity> tableView;
    @FXML
    private TableColumn<BillingIdEntity, Float> billingID;
    @FXML
    private TableColumn<BillingIdEntity, String> address;
    @FXML
    private TableColumn<BillingIdEntity, String> city;
    @FXML
    private TableColumn<BillingIdEntity, String> state;
    @FXML
    private TableColumn<BillingIdEntity, String> zip;

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

        billingID.setCellValueFactory(new PropertyValueFactory<>("billingId"));
        address.setCellValueFactory(new PropertyValueFactory<>("billingAddress"));
        city.setCellValueFactory(new PropertyValueFactory<>("billingCity"));
        state.setCellValueFactory(new PropertyValueFactory<>("billingState"));
        zip.setCellValueFactory(new PropertyValueFactory<>("billingZip"));

    }


    public void populateTable() {


        billingEntityRepository.getAllBilling().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
