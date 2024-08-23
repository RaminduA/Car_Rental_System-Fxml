package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AddClientFormController {
    public TextField txtClientId;
    public JFXButton btnAddClient;
    public JFXButton btnModifyClient;
    public JFXButton btnRemoveClient;
    public TextField txtClientName;
    public TextField txtAddress;
    public TextField txtNIC;
    public TextField txtContact;
    public AnchorPane loadContext;
    public JFXTextField txtSearchtId;


    public void textFieldsRealeased(KeyEvent keyEvent) {
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void AddClientOnAction(ActionEvent actionEvent) {
    }

    public void ModifyClientOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ClientModifyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadContext.getChildren().clear();
        loadContext.getChildren().add(load);
    }

    public void RemoveClientOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ClientRemoveForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loadContext.getChildren().clear();
        loadContext.getChildren().add(load);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void clientId_KeyPress(KeyEvent keyEvent) {
    }

    public void clientName_KeyPress(KeyEvent keyEvent) {
    }

    public void clientAddress_KeyPress(KeyEvent keyEvent) {
    }

    public void clientNIC_KeyPress(KeyEvent keyEvent) {
    }

    public void contact_KeyPress(KeyEvent keyEvent) {
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void searchClientOnAction(ActionEvent actionEvent) {
    }
}
