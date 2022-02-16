package lesson3.Flowers;

import java.util.ArrayList;

public class FlowerShop {

    public static void bouquetInfo(Flower[] bouquet) {

        System.out.println("Количество цветов в букете: " + bouquet.length + "\nСостав букета: ");

        ArrayList<Flower> uniqueFlowers = new ArrayList<>();
        for (Flower x : bouquet) {
            if (!uniqueFlowers.contains(x))
                uniqueFlowers.add(x);
        }

        int[] repeatingFlowers = new int[uniqueFlowers.size()];
        for (int i = 0; i < uniqueFlowers.size(); i++) {
            repeatingFlowers[i] = 0;
            for (Flower flower : bouquet) {
                if (flower == uniqueFlowers.get(i))
                    repeatingFlowers[i]++;
            }
        }

        for (int i = 0; i < uniqueFlowers.size(); i++) {
            System.out.println(uniqueFlowers.get(i).getName() + ": " + repeatingFlowers[i] + "шт.");
        }

        float sum = 0;
        for (Flower x : bouquet) sum += x.getPrice();

        System.out.println("Стоимость букета: " + sum);
    }

    public static void main(String[] args) {

        float price = 100;

        Flower redRose = new Rose("Красная роза", price);
        Flower orangeRose = new Rose("Оранжевая роза", price);
        Flower whiteLily = new Lily("Белая лилия", price);
        Flower violetLily = new Lily("Фиолетовая лилия", price);
        Flower pinkCarnation = new Carnation("Розовая гвоздика", price);
        Flower yellowTulip = new Tulip("Жёлтый тюльпан", price);
        Flower crimsonTulip = new Tulip("Малиновый тюльпан", price);

        Flower[] bouquet1 = {redRose, redRose, redRose, redRose, orangeRose, orangeRose, orangeRose};
        Flower[] bouquet2 = {whiteLily, whiteLily, whiteLily, whiteLily, yellowTulip, yellowTulip, yellowTulip};
        Flower[] bouquet3 = {pinkCarnation, pinkCarnation, pinkCarnation, pinkCarnation,
                crimsonTulip, crimsonTulip, crimsonTulip, crimsonTulip, violetLily};

        Flower[][] bouquetRange = {bouquet1, bouquet2, bouquet3};
        for (int i = 0; i < bouquetRange.length; i++) {
            System.out.println("Букет №" + (i + 1));
            bouquetInfo(bouquetRange[i]);
            System.out.println("-----------------------------------------");
        }
    }
}