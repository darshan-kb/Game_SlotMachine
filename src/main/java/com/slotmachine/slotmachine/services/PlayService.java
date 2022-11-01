package com.slotmachine.slotmachine.services;
import com.slotmachine.slotmachine.entities.Players;
import com.slotmachine.slotmachine.entities.Slot;

public interface PlayService {
    public Slot playGame(Players[] p);
}
