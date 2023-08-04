package com.jwt.jwtExample.controllers;

import com.jwt.jwtExample.Entity.Security;
import com.jwt.jwtExample.Entity.Trade;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;

@RestController
public class TradeController {

    @GetMapping("/bonds/trade")
    public Trade getTradeById(@RequestParam("id")Integer tradeId)
    {
         return Trade.builder().id(tradeId).Bookid(2).Counterpartyid(3).SettlementDate(Date.valueOf("2023-08-04")).Buy_sell("Buy").TradeDate(Date.valueOf("2023-09-12")).build();
    }

    @GetMapping("/bonds/trade/{id}/security")
    public Security retriveSecurityByTradeId(@PathVariable("id") Integer id)
    {
        return Security.builder().coupon(15).CUSIP(1).FaceValue(1000).ISIN(9).MaturityDate(Date.valueOf("2022-10-10")).build();
    }

//    @@lknlnlinet trade by ID
//	Retrieve security to which the trade belongs
//	Create and update a trade


}
