package org.example.vehicles;

import org.example.cars.ElectricCar;

public class Tesla extends ElectricCar {
    public Tesla(int autonomy) {
        super("Tesla", autonomy, 500);
    }
}
