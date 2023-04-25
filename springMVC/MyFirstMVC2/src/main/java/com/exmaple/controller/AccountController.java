package com.exmaple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exmaple.entity.Account;
import com.exmaple.service.AccountService;

/* All Controllers must be annotated with @Controller!
 * This lets your component scan know that
 * this is a controller file and it will be seen.
 */
@Controller
public class AccountController {
    // Autowiring is importing a Spring bean into your class, so you don't have to construct it
    // Its very common practice to autowire your service into your controller
    @Autowired
    AccountService accountService;

    /*
     * GetMapping is when you are going straight to a url, not through a button
     * When i go to http://localhost:8080/ in my browser,
     * my GetMapping will return the home.jsp
     */
    @GetMapping("/")
    public String index() {
        // Inside of the mappings, you need do your logic to set up your page
        // It just so happens that in this case, we dont need any
        // but look below and generally you will see that you do
        return "home";
    }

    // url in GetMapping should match browser
    @GetMapping("/signUp")
            // The model is how you put your java data on to the page, or capture the data from a page
    public String signUp(Model model) {

        // When you have a form on a page, we need to set that form up with a blank object
        // to capture the form data
        model.addAttribute("personSigningUp", new Account());

        // return String should match your jsp name
        return "signUp";
    }

    // Post mappings are for when you are taking a model attribute from a form
    // and sending it to the Database to be stored
    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Account personSigningUp, Model model) {

        // Send the signed up person to the service to be stored in the list
        accountService.signUp(personSigningUp);

        model.addAttribute("userSignIn", new Account());

        return "signIn";

    }

    @GetMapping("/signIn")
    public String signIn(Model model) {

        model.addAttribute("userSignIn", new Account());


        return "signIn";
    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute Account personSigningIn, Model model) {

        Account signedInPerson = accountService.signIn(personSigningIn);

        if(signedInPerson != null) {
            model.addAttribute("account", signedInPerson);

            return "profile";
        } else {
            return "signIn";
        }
    }
    

}
