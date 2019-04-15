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
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class mainController
{
    @Autowired
    private ConfigurableApplicationContext springContext;

    @FXML
    Button Submit;
    @FXML
    public void Submit(ActionEvent actionEvent) throws IOException {
        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        OrdersController jobFormController = fxmlLoader.getController();
        jobFormController.setReturnScene(Submit.getScene());
        parent.setScene(scene);
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Orders.fxml"));
//        fxmlLoader.setControllerFactory(applicationContext::getBean);
//        Parent root = fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();
    }

}
