package org.example.vehicles;

import org.example.interfaces.Rechargeable;
import org.example.typeOfVehicles.Car;

public class Tesla extends Car implements Rechargeable {
    public Tesla(int autonomy) {
        super("Tesla", autonomy, 500);
    }

    @Override
    public void recharge() {
        fillToMax();
    }
}
