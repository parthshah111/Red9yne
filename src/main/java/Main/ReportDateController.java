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
public class ReportDateController implements Initializable {
    @Autowired
    public ReportDateRepository reportDateRepository;
    @FXML
    private TableView<ReportDateEntity> tableView;

    @FXML
    private TableColumn<ReportDateEntity, Integer> colReportID;
    ;

    @FXML
    private TableColumn<ReportDateEntity, String> colReportDate;

    @FXML
    private TableColumn<ReportDateEntity, String> colGrandTotal;
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
        colReportID.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        colReportDate.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        colGrandTotal.setCellValueFactory(new PropertyValueFactory<>("grandTotal"));
//        colRentalID.setCellValueFactory(new PropertyValueFactory<>("rentalId"));
//        colExpDate.setCellValueFactory(new PropertyValueFactory<>("rentalExp"));
//        colRetDate.setCellValueFactory(new PropertyValueFactory<>("rentalReturn"));
//        colLateDay.setCellValueFactory(new PropertyValueFactory<>("lateDay"));
//        colLateFee.setCellValueFactory(new PropertyValueFactory<>("lateFee"));
//        colLateTotal.setCellValueFactory(new PropertyValueFactory<>("lateTotal"));


    }


//    public void populateTable1 ()
//    {
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableView.getItems().add(x);
//        });
//    }

    public void populateTable() {
        reportDateRepository.getAllReport().forEach(x->{
            tableView.getItems().add(x);
        });
//        lateFeeRepository.getLateFee().forEach(x->{
//            tableView.getItems().add(x);
//        });


    }
}