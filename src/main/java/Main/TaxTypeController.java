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
public class TaxTypeController  implements Initializable {
    @Autowired
    public TaxTypeEntityRepository taxTypeEntityRepository;
    @FXML
    private TableView<TaxTypeEntity> tableView;
    @FXML
    private TableColumn<TaxTypeEntity, Float> taxTypeID;
    @FXML
    private TableColumn<TaxTypeEntity, String> taxPercentage;


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

        taxTypeID.setCellValueFactory(new PropertyValueFactory<>("taxTypeId"));
        taxPercentage.setCellValueFactory(new PropertyValueFactory<>("taxPercentage"));

    }


    public void populateTable() {


        taxTypeEntityRepository.getAllTaxType().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
