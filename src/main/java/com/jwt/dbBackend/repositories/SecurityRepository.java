package com.jwt.dbBackend.repositories;

import com.jwt.dbBackend.entities.Security;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Table(
        name="Security"
)
public interface SecurityRepository extends JpaRepository<Security,Integer> {

    @Query(
            nativeQuery = true,
            value = "select * from security where id= :security_id"
    )
    Security ById(@Param("security_id") Integer securityId);







}
