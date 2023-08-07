package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

}
