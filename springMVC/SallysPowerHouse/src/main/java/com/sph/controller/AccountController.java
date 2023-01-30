package com.sph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    
    @GetMapping("/")
    public String index() {
        
        return "home";
    }

}
