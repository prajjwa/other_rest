package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.Entity.Security;
import com.jwt.dbBackend.Entity.Trade;
import com.jwt.dbBackend.repositories.SecurityRepository;
import com.jwt.dbBackend.repositories.TradeRepository;
import com.jwt.dbBackend.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    SecurityService securityService;

    @GetMapping("/bonds/security")
    public List<Security> getTradeById(@RequestParam(value="id",required = false, defaultValue = "-1")Integer securityId)
    {
        if(securityId==-1) {
            return securityService.getAllSecurities();
        }

        return List.of(securityService.getById(securityId));
    }

    @PostMapping("/create/security")
    public void  createSecurity(@RequestBody Security security)
    {
        securityService.save(security);
    }

    @GetMapping("/bonds/security/trade")
    public List<Trade> getAllTradesForSecurity(@RequestParam("id")Integer securityId)
    {
        return securityService.getAllTradesForSecurity(securityId);
    }

    @DeleteMapping("/bonds/security/delete")
    public void deleteSecurity(@RequestParam("id") Integer securityId)
    {
        securityService.deleteSecurity(securityId);
    }


}
