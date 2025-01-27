package model;

public class Driver {
    private String driverId;
    private String driverName;
    private String driverAddress;
    private String driverContact;
    private String driverNIC;
    private String dStatus;
    private String licenseId;

    public Driver() {
    }

    public Driver(String driverId, String driverName, String driverAddress, String driverContact, String driverNIC, String dStatus, String licenseId) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverAddress = driverAddress;
        this.driverContact = driverContact;
        this.driverNIC = driverNIC;
        this.dStatus = dStatus;
        this.licenseId = licenseId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }

    public String getDriverNIC() {
        return driverNIC;
    }

    public void setDriverNIC(String driverNIC) {
        this.driverNIC = driverNIC;
    }

    public String getdStatus() {
        return dStatus;
    }

    public void setdStatus(String dStatus) {
        this.dStatus = dStatus;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
