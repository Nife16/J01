package com.sph.entity;

public class Account {
    
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Address address;
    public Account() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber="
                + phoneNumber + ", address=" + address + "]";
    }

    

}
