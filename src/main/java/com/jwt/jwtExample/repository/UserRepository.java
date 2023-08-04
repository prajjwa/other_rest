package com.jwt.jwtExample.repository;


import com.jwt.jwtExample.Entity.Users;
import jakarta.persistence.Table;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table(
        name="Users"
)
public interface UserRepository extends JpaRepository<Users,Integer> {
}
