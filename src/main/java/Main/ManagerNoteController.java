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
public class ManagerNoteController implements Initializable {



    @Autowired
    public ManagerNoteRepository managerNoteRepository;
    @FXML
    private TableView<ManagerNoteEntity> tableView;
    @FXML
    private TableColumn<ManagerNoteEntity, Float> noteID;
    @FXML
    private TableColumn<ManagerNoteEntity, String> noteDsc;
    @FXML
    private TableColumn<ManagerNoteEntity, String> noteDate;


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

        noteID.setCellValueFactory(new PropertyValueFactory<>("noteId"));
        noteDsc.setCellValueFactory(new PropertyValueFactory<>("noteDesc"));
        noteDate.setCellValueFactory(new PropertyValueFactory<>("noteDate"));


    }


    public void populateTable() {


        managerNoteRepository.getAllManagerNote().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
