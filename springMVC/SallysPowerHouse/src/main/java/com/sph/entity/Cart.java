package com.sph.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @ManyToMany
    @JoinTable(
        name="cart_products",
        joinColumns={
        @JoinColumn(name="cart_id", referencedColumnName = "id")
        },
        inverseJoinColumns = {
        @JoinColumn(name="product_id", referencedColumnName = "id")
        }
    )
    List<Product> products;


    public Cart() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Cart [id=" + id + ", products=" + products + "]";
    }

    

}
