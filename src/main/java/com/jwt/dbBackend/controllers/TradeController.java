package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.repositories.TradeRepository;
import com.jwt.dbBackend.services.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TradeController {

  @Autowired
  private TradeService tradeService;

    @GetMapping("/bonds/trade")
    public Trade getTradeById(@RequestParam("id")Integer tradeId)
    {
         return tradeService.getById(tradeId);
    }

    @GetMapping("/bonds/trade/security")
    public Security getSecurity(@RequestParam("id") Integer tradeId)
    {
      return  tradeService.getSecurityByTrades(tradeId);
    }

    @PostMapping("bonds/trade/create")
    public void createTrade(@RequestBody Trade trade)
    {
        tradeService.saveTrade(trade);
    }

    @PutMapping("/bonds/trade/update")
    public void updateTrade(@RequestBody Trade trade)
    {
      tradeService.updateTrade(trade);
    }

    @DeleteMapping("/bonds/trade/delete")
    public void deleteTrade(@RequestParam("id")Integer tradeId)
    {
          tradeService.delete(tradeId);
    }

    @GetMapping("/bonds/trade/matured")
     public List<Trade> maturedBonds()
    {
       return tradeService.getMatured();
    }

}
