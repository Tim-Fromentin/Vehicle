package org.example;

public class VehicleWithHeatEngine extends VehicleWithEngine{
    public VehicleWithHeatEngine(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
        this.setName(name);
        this.setAutonomy(autonomy);
        this.setMaxAutonomy(maxAutonomy);
    }
}
