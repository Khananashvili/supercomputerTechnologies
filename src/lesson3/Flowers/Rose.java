package lesson3.Flowers;

public class Rose extends Flower {

    public Rose(String name, float price) {
        super(name, price);
    }

    @Override
    public float getPrice() {
        return (float) (super.getPrice() * 2.5);
    }
}
