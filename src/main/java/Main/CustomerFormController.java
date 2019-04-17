package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerFormController  {
    @Autowired
    public CustomerEntityRepository customerEntityRepository;
    @FXML
    public TextField cusFName;
    @FXML
    public TextField cusLName;
    @FXML
    public TextField cusAddress;
    @FXML
    public TextField cusCity;
    @FXML
    public TextField CusState;
    @FXML
    public TextField cusCountry;
    @FXML
    public TextField cusPhoneNum;
    @FXML
    public TextField cusAltPhoneNum;
    @FXML
    public TextField cusEmail;
    @FXML
    public Button btnAdd;
    public Button backtoMM;

    private Scene returnScene;

    public  void setReturnScene(Scene scene){this.returnScene=scene;}

    @FXML
    public void handleAddCustomer(ActionEvent actionEvent) {
        String  fname = cusFName.getText();
        String  lname = cusLName.getText();
        String  address = cusAddress.getText();
        String  city = cusCity.getText();
        String  state = CusState.getText();
        String  country = cusCountry.getText();
        String  phonenum = cusPhoneNum.getText();
        String  altphone = cusAltPhoneNum.getText();
        String  email = cusEmail.getText();

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerFname(fname);
        customerEntity.setCustomerLname(lname);
        customerEntity.setCustomerAddress(address);
        customerEntity.setCustomerCity(city);
        customerEntity.setCustomerState(state);
        customerEntity.setCustomerCountry(country);
        customerEntity.setCustomerPhone(phonenum);
        customerEntity.setCustomerAltcontact(altphone);
        customerEntity.setCustomerEmail(email);

        customerEntityRepository.save(customerEntity);
    }


    public void backtoMM(ActionEvent actionEvent) { if (returnScene == null) {
        backtoMM.getScene().getWindow().hide();
    } else {
        ((Stage) backtoMM.getScene().getWindow()).setScene(returnScene);
    }
    }
}

