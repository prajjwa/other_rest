package com.jwt.dbBackend.services;

import com.jwt.dbBackend.Entity.Security;
import com.jwt.dbBackend.Entity.Trade;
import com.jwt.dbBackend.repositories.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public Security getById(Integer securityId)
    {
       return securityRepository.ById(securityId);
    }

    public void save(Security security)
    {
        securityRepository.save(security);
    }

    public List<Trade> getAllTradesForSecurity(Integer securityId)
    {
        return this.getById(securityId).getTrades();
    }

    public List<Security> getAllSecurities()
    {
        return securityRepository.findAll();
    }

    public void deleteSecurity(Integer securityId)
    {
        securityRepository.deleteById(securityId);
    }
}
