package com.slotmachine.slotmachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slotmachine.slotmachine.entities.Players;
import com.slotmachine.slotmachine.entities.Slot;
import com.slotmachine.slotmachine.services.PlayService;

@RestController
public class MyController {


    @Autowired
    private PlayService ps;

    @CrossOrigin
    @PostMapping(path="/players", consumes="application/json")
    public Slot playGame(@RequestBody Players[] p){
        return ps.playGame(p);
    }
}
