package com.sph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sph.entity.Account;
import com.sph.entity.Address;
import com.sph.entity.Cart;
import com.sph.service.AccountService;
import com.sph.service.AddressService;
import com.sph.service.CartService;

@RestController
public class AccountRestController {
    
    @Autowired
    AccountService accountService;
    @Autowired
    AddressService addressService;
    @Autowired
    CartService cartService;


    @RequestMapping(
        value="/signUp",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> signUp(@RequestBody Account account) {
        
        try {
            Address blankAddressWithId = addressService.save(new Address());
            Cart cart = cartService.save(new Cart());
            Account signedInAccount = accountService.save(account, blankAddressWithId, cart);

            return new ResponseEntity<>(signedInAccount, HttpStatus.OK);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
