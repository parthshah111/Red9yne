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
public class PaymentInformationController  implements Initializable {
    @Autowired
    public PaymentInformationRepository paymentInformationRepository;
    @FXML
    private TableView<PaymentInformationEntity> tableView;
    @FXML
    private TableColumn<PaymentInformationEntity, Float> paymentID;
    @FXML
    private TableColumn<PaymentInformationEntity, String> paymentHistory;
    @FXML
    private TableColumn<PaymentInformationEntity, String> orderDeposit;
    @FXML
    private TableColumn<PaymentInformationEntity, String> paymentFName;
    @FXML
    private TableColumn<PaymentInformationEntity, String> paymentLName;

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

        paymentID.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        paymentHistory.setCellValueFactory(new PropertyValueFactory<>("paymentHistory"));
        orderDeposit.setCellValueFactory(new PropertyValueFactory<>("orderDeposit"));
        paymentFName.setCellValueFactory(new PropertyValueFactory<>("paymentFName"));
        paymentLName.setCellValueFactory(new PropertyValueFactory<>("paymentLName"));

    }


    public void populateTable() {


        paymentInformationRepository.getAllPaymentInformation().forEach(x -> {
            tableView.getItems().add(x);

        });

    }
}
