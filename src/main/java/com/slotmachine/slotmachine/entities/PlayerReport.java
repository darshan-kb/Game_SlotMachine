package com.slotmachine.slotmachine.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerReport {
    @Id
    private String pid;
    private int retamt;
    private int p_l;
    private String name;
    
    
    public PlayerReport(String pid, int retamt, int p_l, String name) {
        this.pid = pid;
        this.retamt = retamt;
        this.p_l = p_l;
        this.name = name;
    }
    
    public PlayerReport() {
    }

    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public int getRetamt() {
        return retamt;
    }
    public void setRetamt(int retamt) {
        this.retamt = retamt;
    }
    public int getP_l() {
        return p_l;
    }
    public void setP_l(int p_l) {
        this.p_l = p_l;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
