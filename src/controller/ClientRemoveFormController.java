package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ClientRemoveFormController {
    public TextField txtClientId;
    public TextField txtClientName;
    public TextField txtNIC;
    public TextField txtAddress;
    public TextField txtContact;
    public JFXButton btnCancel;
    public JFXButton btnRemoveClient;
    public AnchorPane loadContext;

    public void backToClientDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddClientForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadContext.getChildren().clear();
        loadContext.getChildren().add(load);
    }

    public void clientRemoveOnAction(ActionEvent actionEvent) throws IOException {

    }
}
