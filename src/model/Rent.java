package model;

public class Rent {
    private String rentId;
    private String clientId;
    private String vehicleId;
    private String date;
    private String time;
    private int NoOfDays;
    private Double advancePayment;
    private String returnDate;

    public Rent() {
    }

    public Rent(String rentId, String clientId, String vehicleId, String date, String time, int noOfDays, Double advancePayment, String returnDate) {
        this.rentId = rentId;
        this.clientId = clientId;
        this.vehicleId = vehicleId;
        this.date = date;
        this.time = time;
        NoOfDays = noOfDays;
        this.advancePayment = advancePayment;
        this.returnDate = returnDate;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNoOfDays() {
        return NoOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        NoOfDays = noOfDays;
    }

    public Double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(Double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
