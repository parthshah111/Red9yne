package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class mainController
{
    public TextField userName;
    public TextField passWord;
    @Autowired
    private ConfigurableApplicationContext springContext;
    @FXML Button Submit;

    @FXML
    public void Submit(ActionEvent actionEvent) throws IOException {
        String username= userName.getText();
        String password = passWord.getText();


        String realUsername = "Admin";
        String realPassword = "Admin!";
            if (realUsername.contentEquals(username) && realPassword.contentEquals(password)) {
                Stage parent = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MenuOption.fxml"));
                fxmlLoader.setControllerFactory(springContext::getBean);
                Scene scene = new Scene(fxmlLoader.load());
                MenuOptionController menuOptionController = fxmlLoader.getController();
                menuOptionController.setReturnScene(Submit.getScene());
                parent.setScene(scene);
            }

            else
            {
                System.out.println("Wrong Password");
            }

    }

}
