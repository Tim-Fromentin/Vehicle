package org.example;

import org.example.interfaces.Rechargeable;
import org.example.interfaces.Refuelable;

public class Station {


    private String name;

    public Station(String name) {
        this.name = name;
    }


    public void charge(Rechargeable vehicle) {
        vehicle.recharge();
    }

    public void fuel(Refuelable vehicle) {
        vehicle.refuel();
    }
}
