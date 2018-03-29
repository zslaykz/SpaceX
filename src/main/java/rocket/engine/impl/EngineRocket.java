package main.java.rocket.engine.impl;

import main.java.rocket.engine.Engine;

public class EngineRocket implements Engine {

    private String name;
    private int height;
    private int width;
    private int weight;
    private int fuelConsumtion;
    private int fuelTankSpace;
    private int power;
    private int acceleration;

    public EngineRocket(String engineInput) {
        Engines engines = Engines.valueOf(engineInput);

        this.name = engines.getName();
        this.height = engines.getHeight();
        this.width = engines.getWeight();
        this.weight = engines.getWeight();
        this.fuelConsumtion = engines.getFuelConsumtion();
        this.fuelTankSpace = engines.getFuelTankSpace();
        this.power = engines.getPower();
        this.acceleration = engines.getAcceleration();
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

    public int getFuelConsumtion() {
        return fuelConsumtion;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public int getPower() {
        return power;
    }

    public int getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        return "EngineRocket{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", fuelConsumtion=" + fuelConsumtion +
                ", fuelTankSpace=" + fuelTankSpace +
                ", power=" + power +
                ", acceleration=" + acceleration +
                '}';
    }
}
