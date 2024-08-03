package DesignPatterns.StructuralDesignPatterns.Facade.Entity;

public class Customer {
    private String cusId;
    private String name;
    private String email;
    private String address;
    private long phoneNum;

    public Customer(String cusId, String name, String email, String address, long phoneNum) {
        this.cusId = cusId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCusId() {
        return cusId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }
}
