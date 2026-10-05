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

    @Override
    public String drive(int km) {
        if (km >= autonomy){
            return getName() + " Pas assez d'autonomie";
        }
        autonomy -= km;
        return getName() + " roule sur " + km;
    }
    protected void fillToMax(){
       autonomy = maxAutonomy;
    }

}
