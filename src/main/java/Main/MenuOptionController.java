package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MenuOptionController {

    public void setReturnScene(Scene returnScene) {
        this.returnScene = returnScene;
    }
    @FXML void backtoMM(ActionEvent event){
        var stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(returnScene);
    }

    private Scene returnScene;

    @Autowired
    private ConfigurableApplicationContext springContext;
    @FXML
    Button orders;

    @FXML
    Button customers;

    @FXML
    Button orderDetails;

    @FXML
    Button supplier;

    @FXML
    Button dessert;

    @FXML
    Button appointments;

    @FXML
    Button miscellaneous;

    @FXML
    public void orders(ActionEvent actionEvent) throws IOException {
        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        OrdersController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(orders.getScene());
        parent.setScene(scene);
    }



    @FXML
    public void customers(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Customers.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        CustomersController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(customers.getScene());
        parent.setScene(scene);
    }

    public void orderDetails(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderDetails.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        OrderDetailsController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(orderDetails.getScene());
        parent.setScene(scene);
    }

    public void supplier(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Suppliers.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        SuppliersController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(supplier.getScene());
        parent.setScene(scene);
    }

    public void dessert(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dessert.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        DessertController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(dessert.getScene());
        parent.setScene(scene);
    }

    public void appointments(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AppointmentCustomer.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        AppointmentCustomerController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(appointments.getScene());
        parent.setScene(scene);
    }

    public void miscellaneous(ActionEvent actionEvent) throws IOException {

        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("miscellaneous.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        MiscellaneousController menuOptionController = fxmlLoader.getController();
        menuOptionController.setReturnScene(miscellaneous.getScene());
        parent.setScene(scene);
    }
}
