package org.example.motorbikes;

import org.example.VehicleWithEngine;

public class Motorbike extends VehicleWithEngine {
    public Motorbike(String name, int autonomy, int maxAutonomy) {
        super(name, autonomy, maxAutonomy);
        this.setName(name);
        this.setAutonomy(autonomy);
        this.setMaxAutonomy(maxAutonomy);
    }
}
