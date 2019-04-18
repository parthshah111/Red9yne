package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MiscellaneousController {

    @Autowired
    private ConfigurableApplicationContext springContext;
    @FXML
    Button delivery;

    @FXML
    Button billing;

    @FXML
    Button event;

    @FXML
    Button eventStatus;

    @FXML
    Button foodInventory;

    @FXML
    Button managerNote;

    @FXML
    Button orderStatus;

    @FXML
    Button paymentInfo;

    @FXML
    Button lateFee;

    @FXML
    Button staffs;

    @FXML
    Button staffTitle;

    @FXML
    Button reportDate;

    @FXML
    Button supplyStatus;

    @FXML
    Button taxType;

    @FXML
    Button tax;

    private Scene returnScene;
    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    @FXML void backtoMM(ActionEvent event) {
        var stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(returnScene);
    }

    public void delivery(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Delivery.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        DeliveryController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(delivery.getScene());
        parent.setScene(scene);
    }


    public void billing(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Billing.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        BillingController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(billing.getScene());
        parent.setScene(scene);
    }

    public void event(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Event.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        EventController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(event.getScene());
        parent.setScene(scene);
    }

    public void eventStatus(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EventStatus.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        EventStatusController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(eventStatus.getScene());
        parent.setScene(scene);
    }

    public void foodInventory(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Food.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        FoodController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(foodInventory.getScene());
        parent.setScene(scene);
    }

    public void managerNote(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManagerNote.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        ManagerNoteController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(managerNote.getScene());
        parent.setScene(scene);
    }

    public void orderStatus(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderStatus.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        OrderStatusController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(orderStatus.getScene());
        parent.setScene(scene);
    }

    public void paymentInfo(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PaymentInformation.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        PaymentInformationController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(paymentInfo.getScene());
        parent.setScene(scene);
    }

    public void lateFee(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LateFee.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        LateFeeController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(lateFee.getScene());
        parent.setScene(scene);
    }

    public void staffs (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Staff.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        StaffEntityController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(staffs.getScene());
        parent.setScene(scene);
    }

    public void staffTitle (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StaffTitle.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        StaffTitleController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(staffTitle.getScene());
        parent.setScene(scene);
    }

    public void reportDate (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ReportDate.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        ReportDateController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(reportDate.getScene());
        parent.setScene(scene);
    }

    public void supplyStatus (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupplyStatus.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        SupplyStatusController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(supplyStatus.getScene());
        parent.setScene(scene);
    }

    public void taxType (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TaxType.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        TaxTypeController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(taxType.getScene());
        parent.setScene(scene);
    }

    public void tax (ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tax.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        TaxController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(tax.getScene());
        parent.setScene(scene);
    }
}
