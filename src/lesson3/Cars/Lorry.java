package lesson3.Cars;

public class Lorry extends Car {

    private float carryingCapacity;

    public Lorry(String brand, String carClass, float weight, Engine engine, float carryingCapacity) {
        super(brand, carClass, weight, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public float getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка автомобиля: " + getBrand() + "\nКласс автомобиля: " + getCarClass() +
                "\nМасса автомобиля: " + getWeight() + "\nХарактеристики двигателя: мощность - " +
                engine.getPower() + " л. с., производительность - " + engine.getEfficiency() +
                " %\nГрузоподъёмность: " + getCarryingCapacity());
    }
}
