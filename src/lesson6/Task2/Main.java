package lesson6.Task2;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        System.out.println("Исходный список: ");
        list.print();
        list.remove(1);
        list.print();
        list.remove("4");
        list.print();
        System.out.println("Четвёртый элемент: " + list.get(3));
        System.out.println("Размер списка: " + list.size());
        list.clear();
        list.add("1","3","myArrayList","7");
        System.out.println("Изменённый список: ");
        list.print();
    }
}
