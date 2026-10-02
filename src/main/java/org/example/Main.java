package org.example;

import org.example.cars.Car;
import org.example.motorbikes.Motorbike;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Clio : 150 km au départ, 700 max, essence
//        Tesla : 80 km au départ, 500 max, électrique
//        Zero : 120 km au départ, 180 max, électrique
//        Vélo : pas d'autonomie, il a ses jambes

        Car clio = new Car("Clio", 150, 700);
        System.out.printf("%s : %s km au départ, %s max, essence\n", clio.getName(), clio.getAutonomy(), clio.getMaxAutonomy());
        Car tesla = new Car("Tesla", 80, 500);
        System.out.printf("%s : %s km au départ, %s max, essence\n", tesla.getName(), tesla.getAutonomy(), tesla.getMaxAutonomy());

        Motorbike zero = new Motorbike("Zero", 120, 180);
        System.out.printf("%s : %s km au départ, %s max, essence\n", zero.getName(), zero.getAutonomy(), zero.getMaxAutonomy());

        Bicycle bicycle = new Bicycle("Vélo");
        System.out.printf("%s : pas d'autonomie, il a ses jambes\n", bicycle.getName());

        List<Vehicle> allVehicle = List.of(clio, tesla, zero, bicycle);

        for (int i = 0; i < allVehicle.size(); i++){
            Vehicle vehicle = allVehicle.get(i);
            System.out.println(vehicle.getName() + vehicle.drive(80));
        }
    }
}
