package org.example;

import org.example.interfaces.Rechargeable;
import org.example.interfaces.Refuelable;
import org.example.vehicles.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // new station
        Station stationTours = new Station("Station de tours");

        Clio clio = new Clio(150);

        Tesla tesla = new Tesla(80);

        Yaris yaris = new Yaris(50);

        Zero zero = new Zero(120);

        Btwin btwin = new Btwin();

        List<Vehicle> allVehicle = List.of(clio, tesla, zero, btwin, yaris);
        List<Refuelable> allVehicleWithThermalEngine = List.of(clio, yaris);
        List<Rechargeable> allVehicleWithElectricEngine = List.of(tesla, zero, yaris);

        for (Vehicle vehicle : allVehicle) {
            System.out.println(vehicle.drive(80));
        }

        for (Vehicle vehicle : allVehicle) {
            System.out.println("avant " + vehicle.getName() + " " + vehicle.getAutonomy());
        }


        for (Refuelable vehicle : allVehicleWithThermalEngine) {
            stationTours.fuel(vehicle);
        }

        for (Rechargeable vehicle : allVehicleWithElectricEngine) {
            stationTours.charge(vehicle);
        }
        for (Vehicle vehicle : allVehicle) {
            System.out.println("apres " + vehicle.getName() + " " + vehicle.getAutonomy());
        }


    }
}
