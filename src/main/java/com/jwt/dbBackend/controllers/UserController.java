package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/bonds/user")
    public Users getUser(@RequestParam("userId") Integer userId)
    {
        return service.getUserById(userId);
    }

    @GetMapping("/bonds/user/books")
    public List<Book> getBooks(@RequestParam("userId") Integer userId)
    {
        return service.getUsersBook(userId);
    }

    @GetMapping("/bonds/user/login")
    public String login(@RequestBody Users users)
    {
        Users user=service.getByUsername(users.getEmail());

        if(user==null||!(users.getPassword().equals(user.getPassword()))) {
            return "not authorized";
        }

        return user.getRole();
    }

}
