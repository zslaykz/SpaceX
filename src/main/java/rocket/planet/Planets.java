package main.java.rocket.planet;

public enum Planets {

    MARS("MARS", 56_500_000),
    JUPITER("JUPITER", 585_000_000),
    MOON("MOON", 278_000);

    private String name;
    private int distance;

    Planets(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
