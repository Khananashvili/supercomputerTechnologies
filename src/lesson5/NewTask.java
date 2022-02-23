package lesson5;

/*
Задачи:
1. Написать программу, которая проверяет, является ли строка палиндромом
2. Реализовать удаление повторяющихся символов в строке
3. Реализовать проверку, являются ли две строки анаграммами
4. Напишите Java-программу для лексикографического сравнения двух строк.
5. Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре.
6. Напишите программу на Java для объединения данной строки в конец другой строки.
7. Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов.
8. Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки.
9. Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные.
10. Напишите Java-программу, чтобы получить длину заданной строки.
11. Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр.
12. Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр.
13. Напишите программу на Java, чтобы найти второй по частоте символ в данной строке.
14. Напишите программу на Java для печати после удаления дубликатов из заданной строки.
15. Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке.
16. Напишите программу на Java, которая возвращает true из заданной строки,
если первые два символа в строке также появляются в конце.
17. Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
18. Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке.
Если цифр нет, возвращаемая сумма равна 0.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NewTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер задачи: ");
        int num = in.nextInt();
    }

    public static void isPalindrome(Scanner sc) {
        System.out.print("Задача №1, введите строку: ");
        if (!sc.hasNext()) {
            System.out.println("Строка не введена.");
            return;
        }
        //удаляем пробелы и знаки препинания
        String text = sc.nextLine().replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(text);
        //переворачиваем строку
        strBuilder.reverse();
        //присваиваем перевернутую строку
        String invertedText = strBuilder.toString();
        if (text.equalsIgnoreCase(invertedText))
            System.out.println("Строка является палиндромом.");
        else System.out.println("Строка не является палиндромом.");
    }

    public static void deleteRepeatSymbols(Scanner sc) {
        System.out.print("Задача №2, введите строку: ");
        if (!sc.hasNext()) {
            System.out.println("Строка не введена.");
            return;
        }
        String text = sc.nextLine();
        ArrayList<Character> arrText = new ArrayList<>();
        for (char x : text.toCharArray()) {
            if (!arrText.contains(x) || arrText.contains(' '))
                arrText.add(x);
        }
        String newText = arrText.toString();
    }
}
