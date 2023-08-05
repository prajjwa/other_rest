package com.jwt.jwtExample.repositories;

import com.jwt.jwtExample.Entity.Trade;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

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

//    @Modifying
//    @Query("update trade t set t.bookid = ?2, t.counterpartyid = ?3, t.securityid = ?4 , t.quantity = ?5 ," +
//            " t.status = ?6 , t.price = ?7, t.buy_sell = ?8 , t.tradedate = ?9, t.settlementdate = ?10   where t.id = ?1")
//    void updateTrade(Integer id,Integer bookid, Integer counterpartyid, Integer securityid,Integer quantity
//            ,String status,Integer price,String buy_sell,Date tradedate,Date settlementdate);

}
