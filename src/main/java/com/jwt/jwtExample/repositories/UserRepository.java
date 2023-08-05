package com.jwt.jwtExample.repositories;


import com.jwt.jwtExample.Entity.Users;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(
        name="Users"
)
public interface UserRepository extends JpaRepository<Users,Integer> {
}
