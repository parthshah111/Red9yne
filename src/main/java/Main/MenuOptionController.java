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

import java.io.IOException;

public class MenuOptionController {
    @Autowired
    private ConfigurableApplicationContext springContext;
    @FXML
    Button orders;

    @FXML
    Button customers;

    @FXML
    public void orders(ActionEvent actionEvent) throws IOException {
        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        OrdersController jobFormController = fxmlLoader.getController();
        jobFormController.setReturnScene(orders.getScene());
        parent.setScene(scene);
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
//        fxmlLoader.setControllerFactory(springContext::getBean);
//        Parent root = fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
    }



    @FXML
    public void customers(ActionEvent actionEvent) throws IOException {
        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Customers.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        CustomersController jobFormController = fxmlLoader.getController();
        jobFormController.setReturnScene(customers.getScene());
        parent.setScene(scene);
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
//        fxmlLoader.setControllerFactory(springContext::getBean);
//        Parent root = fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
    }
}
