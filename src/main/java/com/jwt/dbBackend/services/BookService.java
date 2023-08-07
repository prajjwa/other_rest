package com.jwt.dbBackend.services;

import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Book> getAllBooks()
    {
        return repository.findAll();
    }

    public List<Trade> getTrades(Integer bookId) {

        return repository.ById(bookId).getTradeList();

    }

    public void deleteBook(Integer bookId)
    {
        repository.deleteBook(bookId);
    }

    public Users userBooks(Integer bookId)
    {
        return repository.ById(bookId).getUser();
    }
}
