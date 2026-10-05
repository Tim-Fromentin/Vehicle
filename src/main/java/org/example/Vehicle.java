package org.example;

public abstract class Vehicle {
    private String name;


    public int getAutonomy() {
        return 0;
    }

    public String drive(int km) {
        return name + " roule sur " + km;
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
