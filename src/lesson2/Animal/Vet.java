package lesson2.Animal;

public class Vet {

    public void treatAnimal(Animal animal) {

        System.out.println("Имя животного: " + animal.name +
                "; основная пища: " + animal.food +
                "; место проживания: " + animal.location +
                "\n-----------------------------------------");

    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Animal("Кеша", "Птичий корм", "Клетка");
        animals[1] = new Dog("Джек", "Каша с мясом", "Конура");
        animals[2] = new Cat("Азалия", "Сухой корм", "Домик-лежанка");
        animals[3] = new Horse("Бони", "Трава, сено, овощи", "Стойло");

        Vet veterinary = new Vet();
        for(Animal animal : animals) veterinary.treatAnimal(animal);

    }

}