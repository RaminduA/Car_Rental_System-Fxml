package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class VehicleRemoveFormController {
    public JFXButton btnRemoveVehicle;
    public JFXButton btnCancel;
    public AnchorPane loadDetailContext;

    public void VehicleRemoveOnAction(ActionEvent actionEvent) {

    }

    public void BackToVehicleDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadDetailContext.getChildren().clear();
        loadDetailContext.getChildren().add(load);
    }
}
