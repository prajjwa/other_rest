package com.jwt.dbBackend.services;


import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users getUserById(Integer userId)
    {
        return userRepository.ById(userId);
    }

    public List<Book> getUsersBook(String username)
    {
        return  userRepository.ByUsername(username).getBookList();
    }

    public Users getByUsername(String username)
    {
        return userRepository.ByUsername(username);
    }

    public List<Security> getFavBonds(String username)
    {

        List<Book> lis=this.getUsersBook(username);

        List<Security> secure=new ArrayList<>();

        for(Book book:lis)
        {
            List<Trade> trade=book.getTradeList();

            for(Trade trd:trade)
            {
                Security userSecurity=trd.getSecurity();

                if(userSecurity.getIsfav()==1)
                {
                    secure.add(userSecurity);
                }
            }

        }

        return  secure;

    }
}
