package Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.converter.DefaultStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class SuppliersController implements Initializable {
    @Autowired public SupplyStatusEntityRepository supplyStatusEntityRepository;
    @FXML private TableView<SupplyStatusEntity> tableView;
    @FXML private TableColumn<SupplyStatusEntity, Float> supplierName;
    @FXML private TableColumn<SupplyStatusEntity, String>  status;
    @FXML private TextField sName;
    @FXML private ChoiceBox sStatus;
    @FXML private Button deleteSupplier;
    @FXML private Button updateSupplier;
    private Scene returnScene;
    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }

    @FXML
    void backtoMM(ActionEvent event) {
        var stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(returnScene);
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<SupplyStatusEntity> observableList = FXCollections.observableArrayList();
        supplyStatusEntityRepository.findAll().forEach(observableList::add);
        tableView.setItems(observableList);
        tableView.getSelectionModel().selectedItemProperty().addListener((observable,oldval,newval) -> {
            SupplyStatusEntity supply = newval;
            if (supply != null) {
                sName.setText(supply.getSupplyName());
                sStatus.setValue(supply.getSupplyStatus());
                tableView.refresh();
            }
        });
        tableView.getSelectionModel().clearSelection();

        sStatus.getItems().addAll("Active", "Inactive");
        initColumns();
//        populateTable();
        this.deleteSupplier.setDisable(true);
        this.updateSupplier.setDisable(true);
    }

    public void userClickedOnTable()
    {
        this.deleteSupplier.setDisable(false);
        this.updateSupplier.setDisable(false);
    }

    public void addSupplier()
    {
        SupplyStatusEntity supply = new SupplyStatusEntity();
        supply.setSupplyName(sName.getText());
        supply.setSupplyStatus((sStatus.getValue().toString()));
        tableView.getItems().add(supply);
        supplyStatusEntityRepository.save(supply);
        tableView.refresh();
    }

    public void initColumns(){
        supplierName.setCellValueFactory(new PropertyValueFactory<>("supplyName"));
        status.setCellValueFactory(new PropertyValueFactory<>("supplyStatus"));
    }

    @FXML public void deleteSupplier() {
        SupplyStatusEntity supply = tableView.getSelectionModel().getSelectedItem();
        supplyStatusEntityRepository.delete(supply);
        tableView.getItems().remove(supply);
        tableView.getSelectionModel().clearSelection();
        tableView.refresh();
        this.deleteSupplier.setDisable(true);
        this.updateSupplier.setDisable(true);
    }

    @FXML public void updateSupplier() {
        SupplyStatusEntity supply = tableView.getSelectionModel().getSelectedItem();
        supply.setSupplyName(sName.getText());
        supply.setSupplyStatus((sStatus.getValue().toString()));
        supplyStatusEntityRepository.save(supply);
        tableView.getSelectionModel().clearSelection();
        tableView.refresh();
        this.deleteSupplier.setDisable(true);
        this.updateSupplier.setDisable(true);
    }

    public void clear()
    {
        tableView.getSelectionModel().clearSelection();
        sName.setText(null);
        sStatus.setValue(null);
        this.deleteSupplier.setDisable(true);
        this.updateSupplier.setDisable(true);
    }

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
        //***
        supplyStatusEntityRepository.getAllSuppliers().forEach(x->{
            tableView.getItems().add(x);
            //***
//        orderStatusEntityRepository.getAllOrderStatus().forEach(x->{
//            tableViewForStatus.getItems().add(x);
//        });
        });

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

}