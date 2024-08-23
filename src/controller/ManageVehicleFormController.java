package controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Insurence;
import model.Vehicle;
import model.tableModel.VehicleTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

public class    ManageVehicleFormController {
    public JFXButton btnAddVehicle;
    public JFXButton btnModifyVehicle;
    public JFXButton btnRemoveVehicle;
    
    public AnchorPane vehicleDetailsContext;
    
    public TextField txtVehicleId;
    public TextField txtVehicleNumber;
    public TextField txtBrand;
    public TextField txtColour;
    public TextField txtRentCost;
    public TextField txtHireCost;
    public TextField txtDiscount;
    public TextField txtStatus;
    public TextField txtInsurenceId;
    public TextField txtInsurenceCompany;
    public TextField txtContact;
    public TextField txtDetail;
    public TextField txtVehicleType;

    public TableColumn<VehicleTM,String> colVehicleId;
    public TableColumn<VehicleTM,String> colVehicleNumber;
    public TableColumn<VehicleTM,String> colBrand;
    public TableColumn<VehicleTM,String> colColour;
    public TableColumn<VehicleTM,String> colType;
    public TableColumn<VehicleTM,Double> colRentCost;
    public TableColumn<VehicleTM,Double> colHireCost;
    public TableColumn<VehicleTM,String> colInsurenceId;
    public TableColumn<VehicleTM,String> colCompany;
    public TableColumn<VehicleTM,String> colContact;
    public TableColumn<VehicleTM,String> colDetail;
    public TableColumn<VehicleTM,String> colStatus;
    public TableColumn<VehicleTM,Double> colDiscount;

    public TableView<VehicleTM> tblVehicle;

    ObservableList<VehicleTM> obList= FXCollections.observableArrayList();

    public void initialize(){

        //setInsuranceId();
        //setVehicleId();
        viewAllVehicle();

        colVehicleId.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        colVehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colBrand.setCellValueFactory(new PropertyValueFactory<>("vehicleBrand"));
        colColour.setCellValueFactory(new PropertyValueFactory<>("vehicleColour"));
        colRentCost.setCellValueFactory(new PropertyValueFactory<>("rentalCost"));
        colHireCost.setCellValueFactory(new PropertyValueFactory<>("taxiCost"));
        colInsurenceId.setCellValueFactory(new PropertyValueFactory<>("insurenceId"));
        colCompany.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colDetail.setCellValueFactory(new PropertyValueFactory<>("detail"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("vStatus"));
        colDiscount.setCellValueFactory(new PropertyValueFactory<>("discount"));

        tblVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)-> {
                setVehicleData(newValue);
            }
        );

    }

    private void setVehicleId() {
        txtVehicleId.setText(new VehicleController().getVehicleId());
    }

    private void setInsuranceId() {
        txtInsurenceId.setText(new InsurenceController().getInsurenceId());
    }

    private void viewAllVehicle() {
        obList.clear();
        ArrayList<Vehicle> vehicles=new VehicleController().getAllVehicle();
        ArrayList<Insurence> insurances=new InsurenceController().getAllInsurence();
        ArrayList<VehicleTM> vehicleList=new ArrayList<>();
        for(int i=0; i<vehicles.size(); i++) {
            Vehicle ve=vehicles.get(i);
            Insurence in=insurances.get(i);
            vehicleList.add(new VehicleTM(
                    ve.getVehicleId(),
                    ve.getVehicleNo(),
                    ve.getVehicleType(),
                    ve.getBrand(),
                    ve.getColour(),
                    ve.getRentalCost(),
                    ve.getHireCost(),
                    ve.getDiscount(),
                    ve.getvStatus(),
                    ve.getInsurenceId(),
                    in.getCompanyName(),
                    in.getContact(),
                    in.getDetail()
                )
            );
        }
        obList.addAll(vehicleList);
        tblVehicle.setItems(obList);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void setVehicleData(VehicleTM v) {
        if(v!=null){
            txtVehicleId.setText(v.getVehicleId());
            txtVehicleNumber.setText(v.getVehicleNo());
            txtVehicleType.setText(v.getVehicleType());
            txtBrand.setText(v.getBrand());
            txtColour.setText(v.getColour());
            txtRentCost.setText(String.valueOf(v.getRentalCost()));
            txtHireCost.setText(String.valueOf(v.getHireCost()));
            txtDiscount.setText(String.valueOf(v.getDiscount()));
            txtStatus.setText(v.getvStatus());
            txtInsurenceId.setText(v.getInsurenceId());
            txtInsurenceId.setText(v.getInsurenceId());
            txtInsurenceCompany.setText(v.getCompanyName());
            txtContact.setText(v.getContact());
            txtDetail.setText(v.getDetail());
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void AddVehicleOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {

        Vehicle vehicle1 = new Vehicle(txtVehicleId.getText(),txtVehicleNumber.getText(),txtVehicleType.getText(),txtBrand.getText(),txtColour.getText(),Double.parseDouble(txtRentCost.getText()),Double.parseDouble(txtHireCost.getText()),Double.parseDouble(txtDiscount.getText()),txtStatus.getText(),txtInsurenceId.getText());
        Insurence insurence1 = new Insurence(txtInsurenceId.getText(),txtInsurenceCompany.getText(),txtContact.getText(),txtDetail.getText());

        if(new InsurenceController().saveInsurence(insurence1) && new VehicleController().saveVehicle(vehicle1))
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
        else
            new Alert(Alert.AlertType.WARNING, "Try Again..").show();
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ModifyVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleModifyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        vehicleDetailsContext.getChildren().clear();
        vehicleDetailsContext.getChildren().add(load);
    }

    public void RemoveVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/VehicleRemoveForm.fxml");
        Parent load = FXMLLoader.load(resource);
        vehicleDetailsContext.getChildren().clear();
        vehicleDetailsContext.getChildren().add(load);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void textFieldsRealeased(KeyEvent keyEvent) {
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void vehicleId_KeyPress(KeyEvent keyEvent) {
    }

    public void vehicleNumber_KeyPress(KeyEvent keyEvent) {
    }

    public void vehicleBrand_KeyPress(KeyEvent keyEvent) {
    }

    public void vehicleType_KeyPress(KeyEvent keyEvent) {
    }

    public void vehicleColour_KeyPress(KeyEvent keyEvent) {
    }

    public void rentCost_KeyPress(KeyEvent keyEvent) {
    }

    public void hireCost_KeyPress(KeyEvent keyEvent) {
    }

    public void discount_KeyPress(KeyEvent keyEvent) {
    }

    public void status_KeyPress(KeyEvent keyEvent) {
    }

    public void insurenceId_KeyPress(KeyEvent keyEvent) {
    }

    public void contact_KeyPress(KeyEvent keyEvent) {
    }

    public void clientId_KeyPress(KeyEvent keyEvent) {
    }

    public void detail_KeyPress(KeyEvent keyEvent) {
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void bakToHomeOnClick(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        vehicleDetailsContext.getChildren().clear();
        vehicleDetailsContext.getChildren().add(load);
    }
}
