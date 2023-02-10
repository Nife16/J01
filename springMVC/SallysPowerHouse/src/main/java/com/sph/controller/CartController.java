package com.sph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import javax.servlet.http.HttpSession;

import com.sph.service.CartService;
import com.sph.service.AccountService;
import com.sph.service.ProductService;

import com.sph.entity.Account;
import com.sph.entity.Product;

@Controller
public class CartController {

    @Autowired
    AccountService accountService;

    @Autowired
    ProductService productService;

    @Autowired
    CartService cartService;
    

    @GetMapping("/cart/{productId}")
    public String addToCart(@PathVariable Integer productId, HttpSession session, Model model) {

        String email = (String) session.getAttribute("email");

        if(email != null) {
            Account signInPerson = accountService.getByEmail(email);

            Product product = productService.findById(productId);

            cartService.addToCart(signInPerson.getCart(), product);

            model.addAttribute("account", signInPerson);

            return "cart";

        }
        return "home";
    }
    
    @GetMapping("/cart")
    public String cart(HttpSession session, Model model) {

        String email = (String) session.getAttribute("email");

        if(email != null) {
            Account signInPerson = accountService.getByEmail(email);

            model.addAttribute("account", signInPerson);

            return "cart";

        }
        return "home";
    }

}
