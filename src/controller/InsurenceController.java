package controller;

import db.DBConnection;
import model.Insurence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InsurenceController implements InsurenceService {

    @Override
    public boolean saveInsurence(Insurence i) throws SQLException, ClassNotFoundException {
        Connection con= DBConnection.getInstance().getConnection();
        String query="INSERT INTO Insurence VALUES(?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,i.getInsurenceId());
        stm.setObject(2,i.getCompanyName());
        stm.setObject(3,i.getContact());
        stm.setObject(4,i.getDetail());
        return stm.executeUpdate()>0;
    }

    @Override
    public Insurence getInsurence(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean modifyInsurence(Insurence i) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteInsurence(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public ArrayList<Insurence> getAllInsurence() {
        try {
            PreparedStatement statement=DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Insurence");
            ResultSet resultSet=statement.executeQuery();
            ArrayList<Insurence> insurenceList=new ArrayList<>();
            while(resultSet.next()){
                insurenceList.add(new Insurence(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getString(4)
                        )
                );
            }
            return insurenceList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    public String getInsurenceId() {
        try {
            PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement("SELECT InsurenceId FROM Insurence ORDER BY vehicleId DESC LIMIT 1");
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
