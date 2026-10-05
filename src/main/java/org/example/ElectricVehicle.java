package org.example;

public class ElectricVehicle extends VehicleWithElectricEngine{
    public ElectricVehicle(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
    }

    public void recharge(){
        this.setAutonomy(this.getMaxAutonomy());
    }
}
