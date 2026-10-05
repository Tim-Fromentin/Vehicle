package org.example;

public class VehicleWithElectricEngine extends VehicleWithEngine{
    public VehicleWithElectricEngine(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
        this.setName(name);
        this.setAutonomy(autonomy);
        this.setMaxAutonomy(maxAutonomy);
    }
}
