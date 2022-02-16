package lesson3.Cars;

public class Engine {

    private float power;
    private float efficiency;

    public Engine(float power, float efficiency) {
        this.power = power;
        this.efficiency = efficiency;
    }

    public float getPower() {
        return power;
    }
    public float getEfficiency() {
        return efficiency;
    }
}
