package by.academy.homework2;

import java.util.Scanner;

// Условие здачи: ввести 2 слова, состоящие из четного числа букв.
// Получить слово состоящее из первой половины первого слова и второй половины второго слова.

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        String[] array = new String[size];

        for (int i = 0, j = 1; i < size; ) {
            System.out.println("Введите " + j + " слово");
            String str = sc.nextLine();
            if (str.length() % 2 == 0) {
                array[i] = str;
                i++;
                j++;
            } else {
                System.out.println("Введите слово из чётного числа букв !");
            }
        }
        System.out.print("Введённые элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println();
        System.out.println();
        String sumStr = (array[0].substring(0, array[0].length() / 2)) +
                (array[1].substring(array[1].length() / 2));

        System.out.println(sumStr);
        sc.close();
    }
}
