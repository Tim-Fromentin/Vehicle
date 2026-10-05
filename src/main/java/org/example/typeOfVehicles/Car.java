package org.example.typeOfVehicles;

import org.example.VehicleWithEngine;

public class Car extends VehicleWithEngine {
    public Car(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
        this.setName(name);
        this.setAutonomy(autonomy);
        this.setMaxAutonomy(maxAutonomy);
    }
}
