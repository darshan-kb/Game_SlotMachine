package com.slotmachine.slotmachine.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PlayersData {
    @Id
    private String id;
    private String text;
    private int val1;
    private int val2;
    private int money;
    private Date date;
    
    public PlayersData(String text, int val1, int val2, String id,int money) {
        this.text = text;
        this.val1 = val1;
        this.val2 = val2;
        this.id = id;
        this.money = money;
        
    }
    public PlayersData(){

    }
    public PlayersData(Players p){
        this.text = p.getText();
        this.val1 = p.getVal1();
        this.val2 = p.getVal2();
        this.id = p.getId();
        this.money = p.getMoney();
    }
    

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getVal1() {
        return val1;
    }
    public void setVal1(int val1) {
        this.val1 = val1;
    }
    public int getVal2() {
        return val2;
    }
    public void setVal2(int val2) {
        this.val2 = val2;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
}

