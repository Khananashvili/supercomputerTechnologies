package lesson3.Flowers;

public class Lily extends Flower {

    public Lily(String name, float price) {
        super(name, price);
    }

    @Override
    public float getPrice() {
        return (float) (super.getPrice() * 1.5);
    }
}
