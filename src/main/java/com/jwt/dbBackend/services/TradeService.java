package com.jwt.dbBackend.services;

import com.jwt.dbBackend.Entity.Trade;
import com.jwt.dbBackend.repositories.TradeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public Trade getById(Integer tradeId)
    {
        return this.tradeRepository.ById(tradeId);
    }

    public void saveTrade(Trade trade)
    {
        tradeRepository.save(trade);
    }
//
//    public void updateTrade(Trade trade)
//    {
//        tradeRepository.updateTrade(trade.getId(),trade.getBookid(), trade.getCounterpartyid(),trade.getSecurityid(),trade.getQuantity(),
//        trade.getStatus(),trade.getPrice(),trade.getBuy_sell(),trade.getTradedate(),trade.getSettlementdate());
//    }


}
