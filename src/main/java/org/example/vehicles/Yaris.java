package org.example.vehicles;

import org.example.VehicleWithEngine;
import org.example.interfaces.Rechargeable;
import org.example.interfaces.Refuelable;

public class Yaris extends VehicleWithEngine implements Rechargeable, Refuelable {

    public Yaris(int autonomy) {
        super("Yaris", autonomy, 1800);
    }

    @Override
    public void recharge() {
        fillToMax();
    }

    @Override
    public void refuel() {
    fillToMax();
    }
}
