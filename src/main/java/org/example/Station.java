package org.example;

public class Station {


    private String name;

    public Station(String name) {
        this.name = name;
    }


    public void charge(ElectricVehicle vehicle) {
        vehicle.recharge();
    }

    public void fuel(ThermalVehicle vehicle) {
        vehicle.refuel();
    }
}
