package lesson3.Cars;

public class TestDrive {

    public static void main(String[] args) {

        Engine lorryEngine = new Engine(350, 50);
        Engine sportCarEngine = new Engine(500, 85);

        Car lorry = new Lorry("КАМАЗ", "Грузовой автомобиль",
                9000, lorryEngine, 13000);
        Car sportCar = new SportCar("Porsche", "Спортивный автомобиль",
                1700, sportCarEngine, 300);

        lorry.printInfo();
        lorry.start();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.turnLeft();
        lorry.stop();
        System.out.println("-----------------------------------------");
        sportCar.printInfo();
        sportCar.start();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.turnRight();
        sportCar.stop();
    }
}
