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
public class MenuTotalController implements Initializable {
    @Autowired
    public MenuTotalRepository menuTotalRepository;
    @FXML
    private TableView<MenuTotalEntity> tableView;
    @FXML
    private TableColumn<MenuTotalEntity, Float> foodID;
    @FXML
    private TableColumn<MenuTotalEntity, String> foodQty;
    @FXML
    private TableColumn<MenuTotalEntity, String> foodTotal;

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

        foodID.setCellValueFactory(new PropertyValueFactory<>("foodMenuId"));
        foodQty.setCellValueFactory(new PropertyValueFactory<>("foodQty"));
        foodTotal.setCellValueFactory(new PropertyValueFactory<>("foodTotal"));

    }


    public void populateTable() {


        menuTotalRepository.getAllMenuTotal().forEach(x -> {
            tableView.getItems().add(x);

        });

    }

}
