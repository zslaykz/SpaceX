package main.java.rocket.tank.impl;

public enum Tanks {
    TANK_SIZE_XS("Tank_Size_XS", 100, 100, 2500, 300),
    TANK_SIZE_X( "Tank_Size_X",  200, 200, 3000, 400),
    TANK_SIZE_M( "Tank_Size_M",  300, 300, 3500, 500),
    TANK_SIZE_L( "Tank_Size_L",  400, 400, 4000, 600),
    TANK_SIZE_XL("Tank_Size_XL", 500, 500, 4500, 700),
    ;


    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    Tanks(String name, int height, int width,
          int weight, int capacity) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
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
}
