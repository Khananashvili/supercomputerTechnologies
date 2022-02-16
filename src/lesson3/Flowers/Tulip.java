package lesson3.Flowers;

public class Tulip extends Flower{

    public Tulip(String name, float price) {
        super(name, price);
    }

    @Override
    public float getPrice() {
        return (float) (super.getPrice() * 1.15);
    }
}
