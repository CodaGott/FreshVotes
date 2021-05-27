package com.freshvotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

//    @RequestMapping("/login/error")
//    public String loginFailure(Model model){
//        model.addAttribute("param", true);
//        return "login";
//    }
}
