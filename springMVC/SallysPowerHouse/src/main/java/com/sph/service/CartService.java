package com.sph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sph.repo.CartRepo;

import com.sph.entity.Cart;
import com.sph.entity.Product;

@Service
public class CartService {
    
    @Autowired
    CartRepo cartRepo;

    public Cart addToCart(Cart cart, Product product) {

        cart.getProducts().add(product);

        return cartRepo.save(cart);

    }

    public Cart save(Cart cart) {
        return cartRepo.save(cart);
    }

}
