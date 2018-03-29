package main.java.rocket.engine.impl;

public enum Engines {

    ENGINE_CLASS_A("A", 100, 200, 3000, 50, 150, 15_000,500),
    ENGINE_CLASS_B("B", 100, 200, 3000, 50, 150, 15_000,500),
    ENGINE_CLASS_C("C", 100, 200, 3000, 50, 150, 15_000,500);

    private String name;
    private int height;
    private int widht;
    private int weight;
    private int fuelConsumtion;
    private int fuelTankSpace;
    private int power;
    private int acceleration;

    Engines(String name, int height, int widht, int weight, int fuelConsumtion,
            int fuelTankSpace, int power, int acceleration) {
        this.name = name;
        this.height = height;
        this.widht = widht;
        this.weight = weight;
        this.fuelConsumtion = fuelConsumtion;
        this.fuelTankSpace = fuelTankSpace;
        this.power = power;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidht() {
        return widht;
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
}
