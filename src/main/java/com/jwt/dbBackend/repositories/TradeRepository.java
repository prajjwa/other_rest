package com.jwt.dbBackend.repositories;

import com.jwt.dbBackend.Entity.Trade;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Table(
        name="Trade"
)
public interface TradeRepository extends JpaRepository<Trade,Integer> {

    @Query(
            nativeQuery = true,
            value = "select * from trade where id= :trade_id"
    )
    Trade ById(@Param("trade_id") Integer tradeId);


}
