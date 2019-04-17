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
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;
@Controller
public class SupplyStatusController implements Initializable {
    @Autowired
    public SupplyStatusEntityRepository supplyStatusEntityRepository;
    @FXML
    private TableView<SupplyStatusEntity> tableView;

    @FXML
    private TableColumn<SupplyStatusEntity, Integer> colReportID;

    @FXML
    private TableColumn<SupplyStatusEntity,String> colReportDate;

    @FXML
    private TableColumn<SupplyStatusEntity, String> colGrandTotal;

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
        colReportID.setCellValueFactory(new PropertyValueFactory<>("supplyId"));
        colReportDate.setCellValueFactory(new PropertyValueFactory<>("supplyName"));
        colGrandTotal.setCellValueFactory(new PropertyValueFactory<>("supplyStatus"));



    }




    public void populateTable() {
        supplyStatusEntityRepository.getAllSuppliers().forEach(x->{
            tableView.getItems().add(x);
        });
//        reportDateRepository.getAllReport().forEach(x->{
//            tableView.getItems().add(x);
//        });
//        lateFeeRepository.getLateFee().forEach(x->{
//            tableView.getItems().add(x);
//        });
    }
    }
