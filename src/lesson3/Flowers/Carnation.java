package lesson3.Flowers;

public class Carnation extends Flower {

    public Carnation(String name, float price) {
        super(name, price);
    }

    @Override
    public float getPrice() {
        return (float) (super.getPrice() * 0.9);
    }
}
