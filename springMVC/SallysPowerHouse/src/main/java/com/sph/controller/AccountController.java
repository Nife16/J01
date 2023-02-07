package com.sph.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sph.entity.Account;
import com.sph.entity.Address;
import com.sph.service.AccountService;
import com.sph.service.AddressService;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;
    
    @Autowired
    AddressService addressService;

    
    @GetMapping("/")
    public String index(Model model, HttpSession session) {

        String email = (String) session.getAttribute("email");

        if(email != null) {
            Account signInPerson = accountService.getByEmail(email);

            model.addAttribute("account", signInPerson);
            
            return "home";
        } else {
            return "home";
        }
        
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {

        model.addAttribute("account", new Account());

        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Account account, HttpSession session, Model model) {

        Address blankAddressWithId = addressService.save(new Address());
        Account signedInAccount = accountService.save(account, blankAddressWithId);

        session.setAttribute("email", signedInAccount.getEmail());

        model.addAttribute("account", signedInAccount);

        return "redirect:";

    }

    @GetMapping("/signIn")
    public String signIn(Model model) {

        model.addAttribute("account", new Account());

        return "signIn";

    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute Account account, HttpSession session, Model model) {

        Account signInPerson = accountService.signIn(account);

        if(signInPerson == null) {
            model.addAttribute("account", new Account());
            return "signIn";
        }

        session.setAttribute("email", signInPerson.getEmail());

        model.addAttribute("account", signInPerson);

        return "redirect:";


    }

    @GetMapping("/signOut")
    public String signOut(HttpSession session) {

        session.removeAttribute("email");

        return "redirect:";
    }

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {

        String email = (String) session.getAttribute("email");

        if(email == null) {
            return "redirect:";
        }

        Account account = accountService.getByEmail(email);

        if(account == null) {
            return "redirect:";
        }

        model.addAttribute("account", account);


        return "profile";

    }

    @PostMapping("/profile/{accountId}/{addressId}")
    public String profile(@ModelAttribute Account account, Model model,
            @PathVariable("accountId") Integer accountId, @PathVariable("addressId") Integer addressId) {

        account.setId(accountId);
        account.getAddress().setId(addressId);
        
        addressService.save(account.getAddress());

        account = accountService.update(account);

        model.addAttribute("account", account);

        return "profile";

    }

}
