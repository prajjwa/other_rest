package com.jwt.dbBackend.repositories;


import com.jwt.dbBackend.entities.Users;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(
        name="Users"
)
public interface UserRepository extends JpaRepository<Users,Integer> {



}
