package lesson3.Cars;

public class SportCar extends Car{

    private float maxSpeed;

    public SportCar(String brand, String carClass, float weight, Engine engine, float maxSpeed) {
        super(brand, carClass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка автомобиля: " + getBrand() + "\nКласс автомобиля: " + getCarClass() +
                "\nМасса автомобиля: " + getWeight() + "\nХарактеристики двигателя: мощность - " +
                engine.getPower() + " л. с., производительность - " + engine.getEfficiency() +
                " %\nМаксимальная скорость: " + getMaxSpeed());
    }
}
