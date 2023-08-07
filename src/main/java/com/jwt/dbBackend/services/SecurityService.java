package com.jwt.dbBackend.services;

import com.jwt.dbBackend.entities.Security;
import com.jwt.dbBackend.entities.Trade;
import com.jwt.dbBackend.pojos.DateRangeRequestObj;
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

    public void update(Security security)
    {

        Security security_dao=this.getById(security.getId());

        security_dao.setCoupon(security.getCoupon());
        security_dao.setCusip(security.getCusip());
        security_dao.setIsin(security.getIsin());
        security_dao.setIssuer(security.getIssuer());
        security_dao.setFacevalue(security.getFacevalue());
        security_dao.setMaturitydate(security.getMaturitydate());
        security_dao.setStatus(security.getStatus());
        security_dao.setType(security.getType());

        this.save(security_dao);
    }

    public List<Security> getMatured()
    {
        return securityRepository.getMaturedSecurities();
    }

    public Integer getReturnsPastMaturity(List<Security> securities)
    {
        // bond1
        // sell -2
        // sell -2
        // buy +5

        return 0;
    }

    public List<Security> getSecuritiesBasedOnDates(DateRangeRequestObj obj)
    {
        return securityRepository.getSecurityFromDateRange(obj.getStartDate(),obj.getEndDate());
    }

}
