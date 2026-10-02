package org.example;

public abstract class Vehicle {
    private String name;


    public int getAutonomy() {
        return -1;
    }

    public String drive(int km) {
        String vehicleWithEngine = this.getClass().getSuperclass().getSimpleName();
        if (km >= getAutonomy() && getAutonomy() > 0 && vehicleWithEngine != "VehicleWithEngine") {
            return "Pas assez d'autonomie";
        } else return "Vroum";
    }

    public Vehicle() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
