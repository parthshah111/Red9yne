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
public class FoodController implements Initializable {
    @Autowired
    private FoodRepository foodRepository;
    @FXML
    private TableView<FoodEntity> tableView;

    @FXML
    private TableColumn<FoodEntity, Integer> foodID;

    @FXML
    private TableColumn<FoodEntity, String> foodName;

    @FXML
    private TableColumn<FoodEntity, String> foodPrice;

    private Scene returnScene;

    public  void setReturnScene(Scene scene){this.returnScene=scene;}

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
//        eventID.setCellValueFactory(new PropertyValueFactory<>("eventType"));
//        eventStatus.setCellValueFactory(new PropertyValueFactory<>("eventDesc"));
        foodID.setCellValueFactory(new PropertyValueFactory<>("foodId"));
        foodName.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        foodPrice.setCellValueFactory(new PropertyValueFactory<>("foodPrice"));

    }


    public void populateTable() {
//        .getAllStatus().forEach(x->{
//            tableView.getItems().add(x);
//        });
        foodRepository.getAllFood().forEach(x->{
            tableView.getItems().add(x);
        });
    }


}
