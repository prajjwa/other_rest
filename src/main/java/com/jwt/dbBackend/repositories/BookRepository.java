package com.jwt.dbBackend.repositories;

import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Trade;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Table(
        name="Book"
)
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query(
            nativeQuery = true,
            value = "select * from book where id= :book_id"
    )
    Book ById(@Param("book_id") Integer bookId);

    @Modifying
    @Transactional
    @Query("delete from Book t WHERE t.id= :book_id")
    void deleteBook(@Param("book_id") Integer bookId);
}
