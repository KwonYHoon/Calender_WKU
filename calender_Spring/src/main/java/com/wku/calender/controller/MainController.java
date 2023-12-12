package com.wku.calender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showMainPage(Model model) {
//        model.addAttribute("message", "안녕하세요!");
        return "main";
    }

    @GetMapping("/signin")
    public String showSigninPage(Model model) {
        return "sign in";
    }
}
