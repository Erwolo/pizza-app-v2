package com.example.newpizzaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPanelController {

    @GetMapping("admin")
    public String adminPanel() {

        return "adminPanel";
    }
}
