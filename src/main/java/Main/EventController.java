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
public class EventController implements Initializable{
        @Autowired
        public EventEntityRepository eventEntityRepository;
        @FXML
        private TableView<EventEntity> tableView;
        @FXML
        private TableColumn<EventEntity, Float> eventID;
        @FXML
        private TableColumn<EventEntity, String> numGuest;
        @FXML
        private TableColumn<EventEntity, String> venue;
        @FXML
        private TableColumn<EventEntity, String> foodArrival;
        @FXML
        private TableColumn<EventEntity, String> coctailStart;
        @FXML
        private TableColumn<EventEntity, String> dinnerStatus;

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

            eventID.setCellValueFactory(new PropertyValueFactory<>("eventId"));
            numGuest.setCellValueFactory(new PropertyValueFactory<>("numGuest"));
            venue.setCellValueFactory(new PropertyValueFactory<>("venue"));
            foodArrival.setCellValueFactory(new PropertyValueFactory<>("foodArrival"));
            coctailStart.setCellValueFactory(new PropertyValueFactory<>("cocktailStarts"));
            dinnerStatus.setCellValueFactory(new PropertyValueFactory<>("dinnerStatus"));
        }

        public void populateTable() {


            eventEntityRepository.getAllEvent().forEach(x -> {
                tableView.getItems().add(x);

            });

        }
}
