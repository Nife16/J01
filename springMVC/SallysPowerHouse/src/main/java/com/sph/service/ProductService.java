package com.sph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sph.entity.Product;
import com.sph.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAll() {
        
        return productRepo.findAll();

    }

}
