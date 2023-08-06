package com.jwt.dbBackend.repositories;

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
        name="Trade"
)
public interface TradeRepository extends JpaRepository<Trade,Integer> {

    @Query(
            nativeQuery = true,
            value = "select * from trade where id= :trade_id"
    )
    Trade ById(@Param("trade_id") Integer tradeId);

    @Query("select t from Trade t where t.security.maturitydate>=CURRENT_DATE")
    List<Trade>  getMaturedBonds();

    @Modifying
    @Transactional
    @Query("delete from Trade t WHERE t.id= :trade_id")
    void deleteTrade(@Param("trade_id") Integer tradeId);
}
