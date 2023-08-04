package com.jwt.jwtExample.services;

import com.jwt.jwtExample.model.users.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> allUsers=new ArrayList<>();

    public UserService()
    {
        allUsers.add(new User("1","Jack1","Jack1@gmail.com"));
        allUsers.add(new User("2","Jack2","Jack2@gmail.com"));

        allUsers.add(new User("3","Jack3","Jack3@gmail.com"));

        allUsers.add(new User("4","Jack4","Jack4@gmail.com"));

        allUsers.add(new User("5","Jack5","Jack5@gmail.com"));

    }

   public List<User> getAllUsers()
    {
        return this.allUsers;
    }


}
