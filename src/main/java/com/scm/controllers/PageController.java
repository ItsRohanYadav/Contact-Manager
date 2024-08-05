package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.forms.userForm;

@Controller
public class PageController {



    @RequestMapping("/home")
    public String home()
    {
        System.out.println("Home page handler");
        return "home";

    }

    @RequestMapping("/about")
    public String about()
    {
        System.out.println("about page handler");
        return "about";

    }

    @RequestMapping("/services")
    public String services()
    {
        System.out.println("services page handler");
        return "services";

    }


    @RequestMapping("/contact")
    public String contact()
    {
        System.out.println("contact page handler");
        return "contact";

    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("login page handler");
        return "login";

    }

    @RequestMapping("/signup")
    public String signup(Model model) {
        userForm userForm = new userForm();
        model.addAttribute("userForm", userForm);
        System.out.println("signup page handler");
        return "signup";
    }

    
    @RequestMapping(value="/do-signup", method=RequestMethod.POST)
    public String processsignup(@ModelAttribute userForm userForm) {

        System.out.println("processing registration");
        System.out.println(userForm);


 



        return "redirect:/signup";
    }
    
}
