package org.example;

public class Station {


    private String name;

    public Station(String name) {
        this.name = name;
    }
    public String fillUpVehicle(VehicleWithEngine vehicleToRefuel) {
        vehicleToRefuel.setAutonomy(vehicleToRefuel.getMaxAutonomy());
        String name = vehicleToRefuel.getName();
        int km = vehicleToRefuel.getMaxAutonomy();

        String message = "thermal".equals(vehicleToRefuel.getTypeOfEngine())
                ? "La %s fait le plein et repart pour ses %d km."
                : "La %s se recharge pour ses %d km.";

        return String.format(message, name, km);
    }

}
