package Main;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
@Component
public class CustomersController implements Initializable {
    @Autowired private ConfigurableApplicationContext springContext;
    @Autowired public CustomerEntityRepository customerEntityRepository;
    @FXML private Button updateCustomer;
    @FXML private Button deleteCustomer;

    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField cAddress;
    @FXML private TextField cCity;
    @FXML private TextField cState;
    @FXML private TextField pNum;
    @FXML private TextField aNum;
    @FXML private TextField cEmail;
    @FXML private TextField cCountry;

    @FXML private TableView<CustomerEntity> tableView;
    @FXML private TableColumn<CustomerEntity, Float> customerNumber;
    @FXML private TableColumn<CustomerEntity, String>  CustomerFName;
    @FXML private TableColumn<CustomerEntity, String> CustomerLName;
    @FXML private TableColumn<CustomerEntity, String> address;
    @FXML private TableColumn<CustomerEntity, String> city;
    @FXML private TableColumn<CustomerEntity, String> state;
    @FXML private TableColumn<CustomerEntity, String> phone;
    @FXML private TableColumn<CustomerEntity, String> altphone;
    @FXML private TableColumn<CustomerEntity, String> email;

    private Scene returnScene;
    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    @FXML void backtoMM(ActionEvent event) {
        var stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(returnScene);
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<CustomerEntity> observableList = FXCollections.observableArrayList();
        customerEntityRepository.findAll().forEach(observableList::add);
        tableView.setItems(observableList);
        tableView.getSelectionModel().selectedItemProperty().addListener((observable,oldval,newval) -> {
            CustomerEntity cus = newval;
            if (cus != null) {
                firstName.setText(cus.getCustomerFname());
                lastName.setText(cus.getCustomerLname());
                cAddress.setText(cus.getCustomerAddress());
                cCity.setText(cus.getCustomerCity());
                cState.setText(cus.getCustomerState());
                pNum.setText(cus.getCustomerPhone());
                aNum.setText(cus.getCustomerAltcontact());
                cEmail.setText(cus.getCustomerEmail());
                cCountry.setText(cus.getCustomerCountry());
                tableView.refresh();
            }
        });
        tableView.getSelectionModel().clearSelection();
        initColumns();
        populateTable();
        this.deleteCustomer.setDisable(true);
        this.updateCustomer.setDisable(true);
    }

    public void initColumns(){
        customerNumber.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        CustomerFName.setCellValueFactory(new PropertyValueFactory<>("customerFname"));
        CustomerLName.setCellValueFactory(new PropertyValueFactory<>("customerLname"));
        address.setCellValueFactory(new PropertyValueFactory<>("customerAddress"));
        city.setCellValueFactory(new PropertyValueFactory<>("customerCity"));
        state.setCellValueFactory(new PropertyValueFactory<>("customerState"));
        phone.setCellValueFactory(new PropertyValueFactory<>("customerPhone"));
        altphone.setCellValueFactory(new PropertyValueFactory<>("customerAltcontact"));
        email.setCellValueFactory(new PropertyValueFactory<>("customerEmail"));
    }

    public void addCustomer()
    {
        CustomerEntity cus = new CustomerEntity();
        cus.setCustomerFname(firstName.getText());
        cus.setCustomerLname(lastName.getText());
        cus.setCustomerAddress(cAddress.getText());
        cus.setCustomerCity(cCity.getText());
        cus.setCustomerState(cState.getText());
        cus.setCustomerPhone(pNum.getText());
        cus.setCustomerAltcontact(aNum.getText());
        cus.setCustomerEmail(cEmail.getText());
        cus.setCustomerCountry(cCountry.getText());
        tableView.getItems().add(cus);
        customerEntityRepository.save(cus);
        tableView.refresh();
    }

//    public void populateTable1 ()
//    {
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableView.getItems().add(x);
//        });
//    }

    public void populateTable ()
    {
//        productEntity = new ProductEntity();
//        productEntity.setProductname(productname);
//        productEntity.setProductdesc(Description);
//
//        JobEntity jobEntity =tblView.getSelectionModel().getSelectedItem();
//        jobEntity.setProductEntity(productEntity);
//
//        productRepository.save(productEntity);
//        jobRepository.save(jobEntity);

        customerEntityRepository.getAllCustomers().forEach(x->{
            tableView.getItems().add(x);
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableViewForStatus.getItems().add(x);
//        });
        });

    }

//    public void handleCusForm(ActionEvent actionEvent)throws IOException {
//        Stage parent  = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerForm.fxml"));
//        fxmlLoader.setControllerFactory(springContext::getBean);
//        Scene scene = new Scene(fxmlLoader.load());
//        CustomersController customerFormController = fxmlLoader.getController();
//        customerFormController.setReturnScene(btnCusForm.getScene());
//        parent.setScene(scene);
//    }

    public void deleteCustomerClass()
    {
//        String fname = firstName.getText();
//        customerEntityRepository.deletUsersByFirstName(fname);
//        System.out.println("RECORD DELETED");
        CustomerEntity cus = tableView.getSelectionModel().getSelectedItem();
        customerEntityRepository.delete(cus);
        tableView.getItems().remove(cus);
        tableView.getSelectionModel().clearSelection();
        tableView.refresh();
        this.deleteCustomer.setDisable(true);
        this.updateCustomer.setDisable(true);
    }

    public void updateCustomer()
    {
        CustomerEntity cus = tableView.getSelectionModel().getSelectedItem();
        cus.setCustomerFname(firstName.getText());
        cus.setCustomerLname(lastName.getText());
        cus.setCustomerAddress(cAddress.getText());
        cus.setCustomerCity(cCity.getText());
        cus.setCustomerState(cState.getText());
        cus.setCustomerPhone(pNum.getText());
        cus.setCustomerAltcontact(aNum.getText());
        cus.setCustomerEmail(cEmail.getText());
        cus.setCustomerCountry(cCountry.getText());
        customerEntityRepository.save(cus);
        tableView.getSelectionModel().clearSelection();
        tableView.refresh();
        this.deleteCustomer.setDisable(true);
        this.updateCustomer.setDisable(true);
    }

//    public void populateTable ()
//    {
////        int orderID;
////        OrderEntity order = new OrderEntity();
////        order.getOrderNo();
//        orderEntityRepository.getAllOrdersByOrderNo()
//                .forEach(x ->{
//                    tableView.getItems().add(x);
//
//                });
//    }
//
//    @Override public void initialize(URL url, ResourceBundle rb) {
//        OrderID.setCellValueFactory(new PropertyValueFactory<>("orderTotal"));
////        CustomerName.setCellValueFactory(new PropertyValueFactory<>("customerFname"));
////        OrderType.setCellValueFactory(new PropertyValueFactory<>("orderDesc"));
//
////        this.componentButton.setDisable(true);
//        populateTable();
//    }

    public void userClickedOnTable(){
        this.deleteCustomer.setDisable(false);
        this.updateCustomer.setDisable(false);
    }

    public void clear()
    {
        tableView.getSelectionModel().clearSelection();
        firstName.setText(null);
        lastName.setText(null);
        cAddress.setText(null);
        cCity.setText(null);
        cState.setText(null);
        pNum.setText(null);
        aNum.setText(null);
        cEmail.setText(null);
        cCountry.setText(null);
        this.deleteCustomer.setDisable(true);
        this.updateCustomer.setDisable(true);
    }
}