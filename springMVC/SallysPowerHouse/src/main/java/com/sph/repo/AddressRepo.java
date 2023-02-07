package com.sph.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sph.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
    
}
