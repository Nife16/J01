package com.sph.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sph.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
    
}
