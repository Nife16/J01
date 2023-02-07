package com.sph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sph.entity.Address;
import com.sph.repo.AddressRepo;

@Service
public class AddressService {
    
    @Autowired
    AddressRepo addressRepo;


    public Address save(Address address) {
        
        return addressRepo.save(address);
    }

}
