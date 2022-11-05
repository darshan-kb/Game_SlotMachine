package com.slotmachine.slotmachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slotmachine.slotmachine.entities.PlayerReport;
import com.slotmachine.slotmachine.entities.Players;
import com.slotmachine.slotmachine.entities.Slot;
import com.slotmachine.slotmachine.services.PlayService;
import com.slotmachine.slotmachine.services.PlayerReportService;

@RestController
public class MyController {


    @Autowired
    private PlayService ps;
    @Autowired
    private PlayerReportService prd;

    @CrossOrigin
    @PostMapping(path="/players", consumes="application/json")
    public Slot playGame(@RequestBody Players[] p){
        return ps.playGame(p);
    }

    @CrossOrigin
    @PostMapping(path="/playersreport", consumes="application/json")
    public void playGame(@RequestBody PlayerReport[] p){
       prd.addPlayerReport(p);
    }
}
