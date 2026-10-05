package org.example.vehicles;

import org.example.interfaces.Refuelable;
import org.example.typeOfVehicles.Car;

public class Clio extends Car implements Refuelable {
    public Clio(int autonomy){
        super("Clio", autonomy, 700);
    }

    @Override
    public void refuel() {
        fillToMax();
    }
}
