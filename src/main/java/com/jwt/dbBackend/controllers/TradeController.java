package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.Entity.Trade;
import com.jwt.dbBackend.services.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TradeController {

  @Autowired
  private TradeService tradeService;

    @GetMapping("/bonds/trade")
    public Trade getTradeById(@RequestParam("id")Integer tradeId)
    {
         return tradeService.getById(tradeId);
    }

    @PostMapping("bonds/trade/create")
    public void createTrade(@RequestBody Trade trade)
    {
        tradeService.saveTrade(trade);
    }

}
