package com.exmaple.entity;


// This is your Entity, for creating obejcts to be stored
public class Account {

    // MAKE YOUR VARIABLES PRIVATE (encapsulation)
    // AND ALWAYS USE CLASS VERSIONS OF DATATYPES
    private Long id;
    private String name;
    private String password;
    private String email;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
    }
    
}
