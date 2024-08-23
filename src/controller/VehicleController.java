package controller;

import db.DBConnection;
import model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VehicleController implements VehicleService {
    @Override
    public boolean saveVehicle(Vehicle v) throws SQLException, ClassNotFoundException {
        Connection con= DBConnection.getInstance().getConnection();
        String query="INSERT INTO Vehicle VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,v.getVehicleId());
        stm.setObject(2,v.getVehicleNo());
        stm.setObject(3,v.getVehicleType());
        stm.setObject(4,v.getBrand());
        stm.setObject(5,v.getColour());
        stm.setObject(6,v.getInsurenceId());
        stm.setObject(7,v.getRentalCost());
        stm.setObject(8,v.getHireCost());
        stm.setObject(9,v.getvStatus());
        stm.setObject(10,v.getDiscount());
        return stm.executeUpdate()>0;
    }

    @Override
    public Vehicle getVehicle(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean modifyVehicle(Vehicle v) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteVehicle(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public ArrayList<Vehicle> getAllVehicle(){
        PreparedStatement statement= null;
        try {
            statement = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Vehicle");
            ResultSet resultSet=statement.executeQuery();
            ArrayList<Vehicle> vehicleList=new ArrayList<>();
            while(resultSet.next()){
                vehicleList.add(new Vehicle(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getString(4),
                                resultSet.getString(5),
                                resultSet.getDouble(7),
                                resultSet.getDouble(8),
                                resultSet.getDouble(9),
                                resultSet.getString(10),
                                resultSet.getString(6)
                        )
                );
            }
            return vehicleList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public String getVehicleId() {
        PreparedStatement statement= null;
        try {
            statement = DBConnection.getInstance().getConnection().prepareStatement("SELECT vehicleId FROM Vehicle ORDER BY vehicleId DESC LIMIT 1");
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                int index=Integer.parseInt(resultSet.getString(1));
                return String.valueOf(index);
            }else{
                return "";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
