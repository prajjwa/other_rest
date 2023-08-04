package com.jwt.jwtExample.controllers;

import com.jwt.jwtExample.model.users.User;
import com.jwt.jwtExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getAllUsers();
    }



}
