package org.example;

public class ThermalVehicle extends VehicleWithHeatEngine implements Refuelable{
    public ThermalVehicle(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
    }
    @Override
    public void refuel() {
        this.setAutonomy(this.getMaxAutonomy());
    }

}
