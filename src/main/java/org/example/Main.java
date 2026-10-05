package org.example;

import org.example.cars.ElectricCar;
import org.example.cars.ThermalCar;
import org.example.motorbikes.ElectricMotorbike;
import org.example.motorbikes.ThermalMotorbike;
import org.example.vehicles.Btwin;
import org.example.vehicles.Clio;
import org.example.vehicles.Tesla;
import org.example.vehicles.Zero;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // new station
        Station stationTours = new Station("Station de tours");

        Clio clio = new Clio(150);

        Tesla tesla = new Tesla(80);

        Zero zero = new Zero(120);

        Btwin btwin = new Btwin();

        List<Vehicle> allVehicle = List.of(clio, tesla, zero, btwin);
        List<ThermalVehicle> allVehicleWithThermalEngine = List.of(clio);
        List<ElectricVehicle> allVehicleWithElectricEngine = List.of(tesla, zero);

        for (Vehicle vehicle : allVehicle) {
            System.out.println(vehicle.drive(80));
        }


        for (ThermalVehicle vehicle : allVehicleWithThermalEngine) {
            System.out.println("avant " + vehicle.getAutonomy());
            stationTours.fuel(vehicle);
            System.out.println("apres " + vehicle.getAutonomy());
        }

        for (ElectricVehicle vehicle : allVehicleWithElectricEngine) {
            System.out.println("avant " + vehicle.getAutonomy());
            stationTours.charge(vehicle);
            System.out.println("apres " + vehicle.getAutonomy());
        }


    }
}
