package com.slotmachine.slotmachine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slotmachine.slotmachine.entities.PlayersData;

public interface PlayerDao extends JpaRepository<PlayersData,String>{
    
}
