package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ClientModifyFormController {
    public TextField txtClientId;
    public TextField txtClientName;
    public TextField txtAddress;
    public TextField txtNIC;
    public TextField txtContact;
    public JFXButton btnModify;
    public JFXButton btnCancel;
    public AnchorPane loadContext;

    public void modifyClientOnAction(ActionEvent actionEvent) {
    }

    public void backToClientDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddClientForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadContext.getChildren().clear();
        loadContext.getChildren().add(load);
    }
}
