package org.example;

import org.example.cars.ThermalCar;

public class HydbrideVehicle extends VehicleWithEngine implements Refuelable, Rechargeable {
    public HydbrideVehicle(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);

        // interface
        // methode abstraite
        // interface RefuelAbble
        // interface RechargeAbble
    }

    @Override
    public void refuel() {
        this.setAutonomy(this.getMaxAutonomy());
    }

    @Override
    public void recharge() {
        this.setAutonomy(this.getMaxAutonomy());
    }
}
