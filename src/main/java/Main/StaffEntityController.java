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
public class StaffEntityController implements Initializable {
    @Autowired
    public StaffEntityRepository staffEntityRepository;
    @FXML
    private TableView<StaffEntity> tableView;
    @FXML
    private TableColumn<StaffEntity, Float> staffID;
    @FXML
    private TableColumn<StaffEntity, String> staffQty;
    @FXML
    private TableColumn<StaffEntity, String> staffFee;
    @FXML
    private TableColumn<StaffEntity, String> staffTotal;


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

        staffID.setCellValueFactory(new PropertyValueFactory<>("staffId"));
        staffQty.setCellValueFactory(new PropertyValueFactory<>("staffQty"));
        staffFee.setCellValueFactory(new PropertyValueFactory<>("staffFee"));
        staffTotal.setCellValueFactory(new PropertyValueFactory<>("staffTotal"));

    }


    public void populateTable() {


        staffEntityRepository.getAllStaff().forEach(x -> {
            tableView.getItems().add(x);

        });

    }

}
