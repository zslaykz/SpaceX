package main.java.rocket.cabina.impl;

public enum Cabins {

    CABINA_CLASS_A("A", 10, 20, 1000, 2),
    CABINA_CLASS_B("B", 20, 30, 2000, 4),
    CABINA_CLASS_C("C", 30, 40, 3000, 6);



    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

     Cabins(String name, int height,
                  int width, int weight, int capacity) {
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
