package lesson3.Flowers;

public class Flower {

    private String name;
    private float price;

    public Flower(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
