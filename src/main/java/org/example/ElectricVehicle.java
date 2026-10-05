package org.example;

public class ElectricVehicle extends VehicleWithElectricEngine implements Rechargeable{
    public ElectricVehicle(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
    }
    @Override
    public void recharge() {
        this.setAutonomy(this.getMaxAutonomy());
    }

}
