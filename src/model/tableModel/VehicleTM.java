package model.tableModel;

public class VehicleTM {
    private String vehicleId;
    private String vehicleNo;
    private String vehicleType;
    private String brand;
    private String colour;
    private Double rentalCost;
    private Double hireCost;
    private Double discount;
    private String vStatus;
    private String insurenceId;
    private String companyName;
    private String contact;
    private String detail;

    public VehicleTM() { }

    public VehicleTM(String vehicleId, String vehicleNo, String vehicleType, String brand, String colour, Double rentalCost, Double hireCost, Double discount, String vStatus, String insurenceId, String companyName, String contact, String detail) {
        this.setVehicleId(vehicleId);
        this.setVehicleNo(vehicleNo);
        this.setVehicleType(vehicleType);
        this.setBrand(brand);
        this.setColour(colour);
        this.setRentalCost(rentalCost);
        this.setHireCost(hireCost);
        this.setDiscount(discount);
        this.setvStatus(vStatus);
        this.setInsurenceId(insurenceId);
        this.setCompanyName(companyName);
        this.setContact(contact);
        this.setDetail(detail);
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getRentalCost() {
        return rentalCost;
    }
    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public Double getHireCost() {
        return hireCost;
    }
    public void setHireCost(Double hireCost) {
        this.hireCost = hireCost;
    }

    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getvStatus() {
        return vStatus;
    }
    public void setvStatus(String vStatus) {
        this.vStatus = vStatus;
    }

    public String getInsurenceId() {
        return insurenceId;
    }
    public void setInsurenceId(String insurenceId) {
        this.insurenceId = insurenceId;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "VehicleTM{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", vehicleNo='" + getVehicleNo() + '\'' +
                ", vehicleType='" + getVehicleType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", rentalCost=" + getRentalCost() +
                ", hireCost=" + getHireCost() +
                ", discount=" + getDiscount() +
                ", vStatus='" + getvStatus() + '\'' +
                ", insurenceId='" + getInsurenceId() + '\'' +
                ", companyName='" + getCompanyName() + '\'' +
                ", contact='" + getContact() + '\'' +
                ", detail='" + getDetail() + '\'' +
                '}';
    }
}