package org.example;

public class ThermalVehicle extends VehicleWithHeatEngine{
    public ThermalVehicle(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
    }

    public void refuel(){
        this.setAutonomy(this.getMaxAutonomy());
    }
}
