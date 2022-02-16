package lesson3.Cars;

public abstract class Car {

    private String brand;
    private String carClass;
    private float weight;
    Engine engine;

    public Car(String brand, String carClass, float weight, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public String getBrand() {
        return brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public float getWeight() {
        return weight;
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
}
