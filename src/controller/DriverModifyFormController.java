package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DriverModifyFormController {
    public JFXButton btnModifyDriver;
    public JFXButton btnCancel;
    public AnchorPane loadDetailContext;

    public void ModifyDriverOnAction(ActionEvent actionEvent) {
    }

    public void BackToDriverDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadDetailContext.getChildren().clear();
        loadDetailContext.getChildren().add(load);
    }
}
