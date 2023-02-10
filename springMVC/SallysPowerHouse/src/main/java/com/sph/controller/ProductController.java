package com.sph.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sph.entity.Account;
import com.sph.entity.Product;
import com.sph.service.AccountService;
import com.sph.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    AccountService accountService;
    @Autowired
    ProductService productService;
    
    @GetMapping("/allProducts")
    public String allProducts(HttpSession session, Model model) {

        String email = (String) session.getAttribute("email");

        if(email != null) {
            Account signInPerson = accountService.getByEmail(email);

            List<Product> allProducts = productService.getAll();

            model.addAttribute("account", signInPerson);

            model.addAttribute("allProducts", allProducts);            
            
            return "allProducts";
        } else {
            return "redirect:";
        }
    }

}
