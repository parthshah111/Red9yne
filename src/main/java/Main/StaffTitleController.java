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
public class StaffTitleController implements Initializable {
    @Autowired
    public StaffTitleEntityRepository staffTitleEntityRepository;
    @FXML
    private TableView<StaffTitleEntity> tableView;
    @FXML
    private TableColumn<StaffTitleEntity, Float> titleID;
    @FXML
    private TableColumn<StaffTitleEntity, String> titleDesc;


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

        titleID.setCellValueFactory(new PropertyValueFactory<>("tittleId"));
        titleDesc.setCellValueFactory(new PropertyValueFactory<>("tittleDesc"));


    }


    public void populateTable() {


        staffTitleEntityRepository.getAllStaffTitle().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
