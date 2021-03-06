package com.example.newpizzaapp.controller;


import com.example.newpizzaapp.model.MyAuthenticationUtil;
import com.example.newpizzaapp.model.User;
import com.example.newpizzaapp.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserListController {

    private final UserService userService;

    public UserListController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers(Model model, Authentication authentication) {
        MyAuthenticationUtil.addToModelAuthDetails(model, authentication);
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);

        return "users";
    }


}
