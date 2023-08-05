package com.jwt.jwtExample.controllers;

import com.jwt.jwtExample.Entity.Security;
import com.jwt.jwtExample.repositories.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityController {

    @Autowired
    SecurityRepository securityrepository;

    @GetMapping("/bonds/security")
    public Security getTradeById(@RequestParam("id")Integer securityId)
    {
        return securityrepository.ById(securityId);
    }

    @PostMapping("/create/security")
    public String  createTrade(@RequestBody Security security)
    {
        securityrepository.save(security);

        return "Saved Security";
    }

}
