package com.jwt.dbBackend.repositories;


import com.jwt.dbBackend.entities.Book;
import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.entities.Users;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table(
        name="Users"
)
public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query(
            nativeQuery = true,
            value = "select * from users where id= :user_id"
    )
    Users ById(@Param("user_id") Integer userId);

    @Query(
            nativeQuery=true,
            value="select * from users where email= :username"
    )
    Users ByUsername(@Param("username") String username);

}
