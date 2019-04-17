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

    public void setReturnScene(Scene returnScene) {
        this.returnScene = returnScene;
    }

    private Scene returnScene;

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
}
