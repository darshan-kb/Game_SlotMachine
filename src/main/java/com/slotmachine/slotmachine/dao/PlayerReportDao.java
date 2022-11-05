package com.slotmachine.slotmachine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slotmachine.slotmachine.entities.PlayerReport;

public interface PlayerReportDao extends JpaRepository<PlayerReport,String>{
    
}
