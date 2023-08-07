package com.jwt.dbBackend.repositories;

import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

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

    @Query("select s from Security s where s.maturitydate>=CURRENT_DATE")
    List<Security> getMaturedSecurities();

    @Query(
            nativeQuery = true,
            value="select * from Security where maturitydate >= :start_date and maturitydate <= :end_date"
    )
    List<Security> getSecurityFromDateRange(@Param("start_date") Date startDate,@Param("end_date") Date endDate);

}
