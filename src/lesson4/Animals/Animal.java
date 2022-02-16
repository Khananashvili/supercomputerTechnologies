package lesson4.Animals;

public class Animal {

    private boolean isVegetarian;
    private String eats;
    private int noOfLegs;

    public Animal (boolean isVegetarian, String eats, int noOfLegs) {
        this.isVegetarian = isVegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
