package org.example;

public class VehicleWithEngine  extends Vehicle {
    private int autonomy;
    private int maxAutonomy;


    @Override
    public int getAutonomy(){
        return autonomy;
    }
    public int getMaxAutonomy(){
        return maxAutonomy;
    }
    public void setAutonomy(int autonomy){
        this.autonomy = autonomy;
    }

    public void setMaxAutonomy(int maxAutonomy) {
        this.maxAutonomy = maxAutonomy;
    }

    public VehicleWithEngine(String name, int autonomy, int maxAutonomy) {
        super();
        this.setName(name);
        this.setAutonomy(autonomy);
        this.setMaxAutonomy(maxAutonomy);
    }

    public String getTypeOfEngine(){
        String vehicleWithEngine = this.getClass().getSuperclass().getSimpleName();
        if (vehicleWithEngine.equals("ThermalVehicle")){
            return "thermal";
        } else {
            return "electric";
        }
    }


}
