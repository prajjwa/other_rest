package com.jwt.dbBackend.services;

import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.repositories.TradeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void updateTrade(Trade trade)
    {

        Trade trade_dao=this.getById(trade.getId());

        trade_dao.setPrice(trade.getPrice());
        trade_dao.setQuantity(trade.getQuantity());
//        trade_dao.setBookid(trade.getBookid());
        trade_dao.setBuy_sell(trade.getBuy_sell());
        trade_dao.setCounterpartyid(trade.getCounterpartyid());
        trade_dao.setSettlementdate(trade.getSettlementdate());
        trade_dao.setTradedate(trade.getTradedate());
        trade_dao.setStatus(trade.getStatus());

        this.saveTrade(trade_dao);

    }

    public Security getSecurityByTrades(Integer tradeId)
    {
        return this.getById(tradeId).getSecurity();
    }

    public void delete(Integer tradeId)
    {
        tradeRepository.deleteTrade(tradeId);
    }

    public List<Trade> getMatured()
    {
        return  tradeRepository.getMaturedBonds();
    }

    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }
}
