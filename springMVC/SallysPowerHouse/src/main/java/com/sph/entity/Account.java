package com.sph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// Annotate Objects with Entity, lets project know its a Object from the DB
@Entity
// Tells what table the object is coming from
@Table(name = "account")
public class Account {

    // ID lets you know its an id
    @Id
    // Column maps to the same name as the column name in the database, it is case
    // sensitive
    @Column(name = "id")
    // This will configure your id to be auto generated, now you don't need a setter
    // for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    // Column maps to the same name as the column name in the database, it is case
    // sensitive
    @Column(name = "name")
    private String name;
    // Column maps to the same name as the column name in the database, it is case
    // sensitive
    @Column(name = "email", unique=true)
    private String email;
    // Column maps to the same name as the column name in the database, it is case
    // sensitive
    @Column(name = "password")
    private String password;
    // Column maps to the same name as the column name in the database, it is case
    // sensitive
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name="cart_id")
    private Cart cart;


    public Account() {
    }

    public Integer getId() {
        return id;
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
                + phoneNumber + ", address=" + address + ", cart=" + cart + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}
