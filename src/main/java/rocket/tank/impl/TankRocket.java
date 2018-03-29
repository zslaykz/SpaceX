package main.java.rocket.tank.impl;

import main.java.rocket.tank.FuelTank;

public class TankRocket implements FuelTank {
    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    public TankRocket(String fuelTankInput) {
        Tanks tanks = Tanks.valueOf(fuelTankInput);

        this.name = tanks.getName();
        this.height = tanks.getHeight();
        this.width = tanks.getWidth();
        this.weight = tanks.getWeight();
        this.capacity = tanks.getCapacity();
    }



    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "TankRocket{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", capacity=" + capacity +
                '}';
    }
}
