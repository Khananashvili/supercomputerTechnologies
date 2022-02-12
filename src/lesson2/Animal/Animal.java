package lesson2.Animal;

public class Animal {

    protected String name;
    protected String food;
    protected String location;


    public Animal (String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.print("Издаёт звук");
    }

    public void eat() {
        System.out.print("Питается");
    }

    public void sleep() {
        System.out.print("Спит");
    }

}
