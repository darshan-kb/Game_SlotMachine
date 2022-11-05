package com.slotmachine.slotmachine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slotmachine.slotmachine.dao.PlayerReportDao;
import com.slotmachine.slotmachine.entities.PlayerReport;

@Service
public class PlayerReportImp implements PlayerReportService{
    @Autowired
    PlayerReportDao prd;

    @Override
    public void addPlayerReport(PlayerReport[] pr) {
        // TODO Auto-generated method stub
        for(PlayerReport p : pr){
            prd.save(p);
        }
    }
    
}
