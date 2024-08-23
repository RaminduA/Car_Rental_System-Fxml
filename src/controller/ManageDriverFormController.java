package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ManageDriverFormController {
    public JFXButton btnAddDriver;
    public JFXButton btnModifyDriver;
    public JFXButton btnRemoveDriver;
    public AnchorPane driverDetailContext;
    public TextField txtDriverId;
    public TextField txtDriverName;
    public TextField txtNIC;
    public TextField txtAddress;
    public TextField txtDriverContact;
    public TextField txtDriverStatus;
    public TextField txtLicenseId;
    public TextField txtLicenseNumber;
    public TextField txtVehicleType;
    public TextField txtExpireDate;

    public void AddDriverOnAction(ActionEvent actionEvent) {

    }

    public void ModifyDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverModifyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        driverDetailContext.getChildren().clear();
        driverDetailContext.getChildren().add(load);
    }

    public void RemoveDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DriverRemoveForm.fxml");
        Parent load = FXMLLoader.load(resource);
        driverDetailContext.getChildren().clear();
        driverDetailContext.getChildren().add(load);
    }

    public void textFieldsRealeased(KeyEvent keyEvent) {
    }

    public void driverId_KeyPress(KeyEvent keyEvent) {
    }

    public void driverName_KeyPress(KeyEvent keyEvent) {
    }

    public void driverNIC_KeyPress(KeyEvent keyEvent) {
    }

    public void driverAddress_KeyPress(KeyEvent keyEvent) {
    }

    public void driverContact_KeyPress(KeyEvent keyEvent) {
    }

    public void driverStatus_KeyPress(KeyEvent keyEvent) {
    }

    public void licenseId_KeyPress(KeyEvent keyEvent) {
    }

    public void licenseNumber_KeyPress(KeyEvent keyEvent) {
    }

    public void vehicleType_KeyPress(KeyEvent keyEvent) {
    }

    public void expireDate_KeyPress(KeyEvent keyEvent) {
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void backToHomeOnClick(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        driverDetailContext.getChildren().clear();
        driverDetailContext.getChildren().add(load);
    }
}
