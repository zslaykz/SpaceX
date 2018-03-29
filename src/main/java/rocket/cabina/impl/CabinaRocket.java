package main.java.rocket.cabina.impl;

import main.java.rocket.cabina.Cabina;

public class CabinaRocket implements Cabina {

    private String name;
    private int height;
    private int width;
    private int weight;
    private int capacity;

    private static Cabins cabins;

    public CabinaRocket(String cabinaInput) {
        Cabins cabins = Cabins.valueOf(cabinaInput);
        this.name = cabins.getName();
        this.height = cabins.getHeight();
        this.width = cabins.getWidth();
        this.weight = cabins.getWeight();
        this.capacity = cabins.getCapacity();
    }

   /* public static Cabins getCabins(String cabinaInput) {
        if (cabins == null){
            return new Cabins(cabinaInput);
        }else {
            return cabins;
        }
    }*/

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

    public static Cabins getCabins() {
        return cabins;
    }



    @Override
    public String toString() {
        return "CabinaRocket{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", capacity=" + capacity +
                '}';
    }
}
