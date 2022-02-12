package lesson2.Animal;

public class Horse extends Animal {

    public Horse (String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        System.out.print("Ржёт");
    }

    @Override
    public void eat() {
        System.out.print("Основная еда: " + this.food + "\n" +
                "Любимое лакомство: яблоко");
    }
}
