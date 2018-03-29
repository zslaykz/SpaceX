package main.java.rocket;

import main.java.rocket.cabina.Cabina;
import main.java.rocket.engine.Engine;
import main.java.rocket.tank.FuelTank;

public class Rocket {

    private Cabina cabina;
    private Engine engine;
    private FuelTank fuelTank;

    private int totalWeight;


    public void  assemblyRocket(Cabina cabina, Engine engine, FuelTank fuelTank){
        setCabina(cabina);
        setEngine(engine);
        setFuelTank(fuelTank);

    }

    public void setCabina(Cabina cabinaInput) {
        this.cabina = cabinaInput;
    }

    public void setEngine(Engine engineInput) {
        this.engine = engineInput;
    }

    public void setFuelTank(FuelTank fuelTankInput) {
        this.fuelTank = fuelTankInput;
    }

    public void setTotalWeight(int totalWeight) {

    }

    public int getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "cabina=" + cabina +
                ", engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
