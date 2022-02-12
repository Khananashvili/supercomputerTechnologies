package lesson2.Animal;

public class Cat extends Animal {

    public Cat (String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print("Мяукает");
    }

    @Override
    public void eat() {
        System.out.print("Основная еда: " + this.food + "\n" +
                "Любимое лакомство: мясные подушечки");
    }
}
