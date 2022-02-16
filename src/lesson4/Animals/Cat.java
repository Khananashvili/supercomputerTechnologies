package lesson4.Animals;

public class Cat extends Animal {

    private String color;

    public Cat (boolean isVegetarian, String eats, int noOfLegs, String color) {
        super(isVegetarian, eats, noOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
