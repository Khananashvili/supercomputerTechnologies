package lesson2.Animal;

public class Dog extends Animal {

    public Dog (String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print("Лает");
    }

    @Override
    public void eat() {
        System.out.print("Основная еда: " + this.food + "\n" +
                "Любимое лакомство: сахарная кость");
    }
}
