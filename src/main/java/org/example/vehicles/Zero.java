package org.example.vehicles;

import org.example.interfaces.Rechargeable;
import org.example.typeOfVehicles.Motorbike;

public class Zero extends Motorbike implements Rechargeable {
    public Zero(int autonomy){
        super("Zero", autonomy, 180);
    }

    @Override
    public void recharge() {
        fillToMax();
    }
}
