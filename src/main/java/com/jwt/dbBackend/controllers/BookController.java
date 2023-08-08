package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.entities.Users;
import com.jwt.dbBackend.services.BookService;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class BookController {

    @Autowired
    BookService service;

     @GetMapping("/bonds/books")
    public List<Book> getBooks()
     {
         return service.getAllBooks();
     }

     @GetMapping("/bonds/books/trades")
    public List<Trade> getBooksTrade(@RequestParam("id")Integer bookId)
     {
         return service.getTrades(bookId);
     }

     @DeleteMapping("/bonds/book/delete")
    void deleteBook(@RequestParam("bookId")Integer bookid)
     {
         service.deleteBook(bookid);
     }

    @GetMapping("/bonds/books/user")
    public Users getBooksUser(@RequestParam("id")Integer bookId)
    {
        return service.userBooks(bookId);
    }

}
