package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DriverRemoveFormController {
    public JFXButton btnCancel;
    public JFXButton btnRemoveDriver;
    public AnchorPane loadDetailContext;

    public void BackToDriverDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadDetailContext.getChildren().clear();
        loadDetailContext.getChildren().add(load);
    }

    public void DriverRemoveOnAction(ActionEvent actionEvent) {
    }
}
