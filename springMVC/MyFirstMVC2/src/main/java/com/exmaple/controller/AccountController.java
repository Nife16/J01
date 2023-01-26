package com.exmaple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/* All Controllers must be annotated with @Controller!
 * This lets your component scan know that
 * this is a controller file and it will be seen.
 */
@Controller
public class AccountController {

    /*
     * GetMapping it is descibing me going to a page
     * When i go to http://localhost:8080/ in my browser,
     * my GetMapping will return the home.jsp
     */
    @GetMapping("/")
    public String index() {
        return "home";
    }
    

    /*
     * The model will allow you to put java data onto your JSP pages in the form of a variable
     */
    @GetMapping("/profile")
    public String profile(Model model) {

        String myName = "Slim Shady";

        model.addAttribute("name", myName);

        return "profile";
    }
}
