package com.jwt.dbBackend.controllers;

import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.pojos.DateRangeRequestObj;
import com.jwt.dbBackend.repositories.SecurityRepository;
import com.jwt.dbBackend.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    SecurityService securityService;

//    @Autowired
//    SecurityRepository repository;

    @GetMapping("/bonds/security")
    public List<Security> getSecurityById(@RequestParam(value="id",required = false, defaultValue = "-1")Integer securityId)
    {
        if(securityId==-1) {
            return securityService.getAllSecurities();
        }

        return List.of(securityService.getById(securityId));
    }

    @PostMapping("bonds/security/create")
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

    @PutMapping("/bonds/security/update")
    public void  updateSecurity(@RequestBody Security security)
    {
        securityService.update(security);
    }

   @GetMapping("/bonds/security/matured")
    public List<Security> maturedSecurity()
   {
       return securityService.getMatured();
   }

   @GetMapping("/bonds/security/daterange")
   public List<Security> dateRange(@RequestBody DateRangeRequestObj obj)
   {
       return securityService.getSecuritiesBasedOnDates(obj);
   }
}
