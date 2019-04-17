package Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class DessertController implements Initializable {
    @Autowired
    public DessertEntityRepository dessertEntityRepository;
    public Button addID;
    public Button deleteID;
    public Button updateID;
    public TextField DessertDesc;
    public TextField DessertName;
    public TextField DessertPrice;


    @FXML
    private TableView<DessertEntity> tableView;
    @FXML private TableColumn<DessertEntity, Float> dessertID;
    @FXML private TableColumn<DessertEntity, String>  dessertName;
    @FXML private TableColumn<DessertEntity, String>  dessertDesc;
    @FXML private TableColumn<DessertEntity, String>  dessertPrice;

    private Scene returnScene;

    @FXML private Button backtoMM;

    @FXML
    void backtoMM(ActionEvent event) {
        if (returnScene == null) {
            backtoMM.getScene().getWindow().hide();
        } else {
            ((Stage) backtoMM.getScene().getWindow()).setScene(returnScene);
        }
    }

    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        initColumns();
        populateTable();
        populatTextField();
    }



    public void initColumns(){

        dessertID.setCellValueFactory(new PropertyValueFactory<>("dessertId"));
        dessertName.setCellValueFactory(new PropertyValueFactory<>("dessertName"));
        dessertDesc.setCellValueFactory(new PropertyValueFactory<>("dessertDesc"));
        dessertPrice.setCellValueFactory(new PropertyValueFactory<>("dessertPrice"));
    }


    public void populateTable ()
    {
        dessertEntityRepository.getAllDessert().forEach(x->{
            tableView.getItems().add(x);

        });

    }

    public void handleaddID(ActionEvent actionEvent) {
        String name = DessertName.getText();
        String description = DessertDesc.getText();
        String price = DessertPrice.getText();

        DessertEntity dessert =new DessertEntity();
        dessert.setDessertName(name);
        dessert.setDessertDesc(description);
        dessert.setDessertPrice(Double.parseDouble(price));
        dessertEntityRepository.save(dessert);
        tableView.getItems().add(dessert);
        tableView.refresh();
    }

    public void handledeleteID(ActionEvent actionEvent) {
        DessertEntity dessert = tableView.getSelectionModel().getSelectedItem();
        dessertEntityRepository.delete(dessert);
        tableView.getItems().remove(dessert);
        tableView.getSelectionModel().clearSelection();
        tableView.refresh();

    }

    public void handleupdateID(ActionEvent actionEvent) {
        DessertEntity dessert = tableView.getSelectionModel().getSelectedItem();
        dessert.setDessertName(DessertName.getText());
        dessert.setDessertDesc(DessertDesc.getText());
        dessert.setDessertPrice(Double.parseDouble(DessertPrice.getText()));
        dessertEntityRepository.save(dessert);
//        tableView.getSelectionModel().clearSelection();
        tableView.refresh();
    }

    public void populatTextField(){
        ObservableList<DessertEntity> observableList = FXCollections.observableArrayList();
        dessertEntityRepository.findAll().forEach(observableList::add);
        tableView.setItems(observableList);
        tableView.getSelectionModel().selectedItemProperty().addListener((observable,oldval,newval) -> {
            DessertEntity des= newval;
            if (des != null) {
                DessertName.setText(des.getDessertName());
                DessertDesc.setText(des.getDessertDesc());
                DessertPrice.setText(String.valueOf(des.getDessertPrice()));
                tableView.refresh();
            }
        });

    }



}