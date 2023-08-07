package com.jwt.dbBackend.services;


import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users getUserById(Integer userId)
    {
        return userRepository.ById(userId);
    }

    public List<Book> getUsersBook(Integer userId)
    {
        return  this.getUserById(userId).getBookList();
    }

}
