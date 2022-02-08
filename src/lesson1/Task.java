package lesson1;

/*
Задачи

1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.
3. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1,
в противном случае не изменять его. Вывести полученное число.
4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
«нулевое число» «положительное нечетное число» и т. д.
7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить,
например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5».
8. Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
    *максимальное значение;
    *сумму положительных элементов;
    *сумму четных отрицательных элементов;
    *количество положительных элементов;
    *среднее арифметическое отрицательных элементов.
9. Дан массив целых чисел: [15,10,51, 6, 5,3,-10,34,0,32,56,-12,24, 52].
Переставить элементы массива в обратном порядке. Вывести результат в консоль.
10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер задачи: ");
        int num = in.nextInt();

        switch (num) {
            case (1) -> firstTask(in);
            case (2) -> secondTask(in);
            case (3) -> thirdTask(in);
            case (4) -> fourthTask(in);
            case (5) -> fifthTask(in);
            case (6) -> sixthTask(in);
            case (7) -> seventhTask(in);
            case (8) -> eighthTask();
            case (9) -> ninthTask();
            case (10) -> tenthTask();
            default -> System.out.println("Задача не найдена");
        }
    }

    public static void firstTask(Scanner sc){

        System.out.print("Задача №1, введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Целое число не введено.");
            return;
        }
        System.out.print("Последняя цифра: " + sc.nextInt() % 10);
    }

    public static void secondTask(Scanner sc){

        System.out.print("Задача №2, введите целое трёхзначное число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Целое трёхзначное число не введено.");
            return;
        }
        int x = sc.nextInt();
        // проверка количества цифр в числе
        if (String.valueOf(Math.abs(x)).length() != 3) {
            System.out.print("Введено не трёхзначное число.");
            return;
        }
        System.out.print("Сумма цифр: " + (x / 100 + x / 10 % 10 + x % 10));
    }

    public static void thirdTask(Scanner sc){

        System.out.print("Задача №3, введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Целое число не введено.");
            return;
        }
        int x = sc.nextInt();
        System.out.print("Результат: " + (x > 0 ? x + 1 : x));
    }

    public static void fourthTask(Scanner sc){
        System.out.print("Задача №4, введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Целое число не введено.");
            return;
        }
        int x = sc.nextInt();
        if (x > 0) x += 1;
        else if (x < 0) x -= 2;
        else x = 10;
        System.out.println("Результат: " + x);
    }

    public static void fifthTask(Scanner sc){
        System.out.println("Задача №5, необходимо ввести три целых числа.");

        System.out.print("Введите первое число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Первое число не введено.");
            return;
        }
        int x = sc.nextInt();

        System.out.print("Введите второе число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Второе число не введено.");
            return;
        }
        int y = sc.nextInt();

        System.out.print("Введите третье число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Третье число не введено.");
            return;
        }
        int z = sc.nextInt();

        if (x <= y && x <= z)
            System.out.println("Наименьшее число: " + x);
        else if (y <= x && y <= z)
            System.out.println("Наименьшее число: " + y);
        else
            System.out.println("Наименьшее число: " + z);
    }

    public static void sixthTask(Scanner sc) {

        System.out.print("Задача №6, введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.print("Целое число не введено.");
            return;
        }
        int x = sc.nextInt();

        String y = "";
        if (x == 0) {
            y += "Нулевое число.";
            System.out.print(y);
            return;
        }

        if (x > 0) y += "Положительное ";
        else y += "Отрицательное ";

        if (x % 2 == 0) y += "чётное ";
        else y += "нечётное ";

        System.out.print(y + "число.");
    }

    public static void seventhTask(Scanner sc) {

        System.out.print("Задача №7, введите целое число, являющееся кодом города: ");
        if (!sc.hasNextInt()) {
            System.out.print("Код города не введён.");
            return;
        }
        int x = sc.nextInt();

        if (x == 905)
            System.out.println("Москва. Стоимость 10-минутного разговора: " + (4.15 * 10) + " руб.");
        else if (x == 194)
            System.out.println("Ростов. Стоимость 10-минутного разговора: " + (1.98 * 10) + " руб.");
        else if (x == 491)
            System.out.println("Краснодар. Стоимость 10-минутного разговора: " + (2.69 * 10) + " руб.");
        else if (x == 800)
            System.out.println("Киров. Стоимость 10-минутного разговора: " + (5.00 * 10) + " руб.");
        else
            System.out.println("Код города не определён.");
    }

    public static void eighthTask() {

        byte[] x = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.println("Массив целых чисел: " + Arrays.toString(x));

        int max = x[0];
        for (int i = 1; i < x.length; i++) max = Math.max(max, x[i]);
        System.out.println("Максимальное значение массива: " + max);

        int positiveSum = 0;
        for (byte b : x) if (b >= 0) positiveSum += b;
        System.out.println("Сумма положительных элементов: " + positiveSum);

        int negativeSum = 0;
        for (byte b : x) if ((b <= 0) && (b % 2 == 0)) negativeSum += b;
        System.out.println("Сумма отрицательных чётных элементов: " + negativeSum);

        byte positiveLength = 0;
        for (byte b : x) if (b > 0) positiveLength++;
        System.out.println("Количество положительных элементов: " + positiveLength);

        float negativeMean = 0;
        byte l = 0;
        for (byte b : x) if (b < 0) {
            negativeMean += b;
            l++;
        }
        System.out.print("Среднее арифметическое отрицательных элементов: " + negativeMean / l);
    }

    public static void ninthTask() {

        byte[] x = {15, 10, 51, 6, 5, 3, -10, 34, 0, 32, 56, -12, 24, 52};
        System.out.println("Массив целых чисел: " + Arrays.toString(x));

        byte[] y = new byte[x.length];
        for (int i = 0; i < x.length; i++)
            y[i] = x[x.length - 1 - i];
        System.out.print("Массив чисел в обратном порядке: " + Arrays.toString(y));
    }

    public static void tenthTask() {

        byte[] x = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("Массив целых чисел: " + Arrays.toString(x));

        byte[] y = new byte[x.length];
        // количество нулей в массиве
        int j = 0;
        for (byte b : x) if (b == 0) j++;
        // в новый массив записываются значения из исходного массива по следующему принципу:
        // если элемент исходного массива не равен нулю, новый массив заполняется с начала, иначе - с конца
        // при этом переменная j служит для того, чтобы цикл for не вышел за границы массива,
        // а переменная k является счётчиком нулей внутри цикла,
        // который передвигает индекс массива вперёд для ненулевых элементов и назад для нулевых элементов
        int k = 0;
        for (int i = 0; i < x.length - j; i++)
            if (x[i + k] != 0) y[i] = x[i + k];
            else {
                y[x.length - 1 - k] = 0;
                k++;
                y[i] = x[i + k];
            }
        System.out.print("Массив чисел с нулями в конце: " + Arrays.toString(y));
    }
}
