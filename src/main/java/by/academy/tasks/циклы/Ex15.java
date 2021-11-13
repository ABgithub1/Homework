package by.academy.tasks.циклы;

// Написать программу,
// которая по заданным значениям чисел a и b находит a в степени b.
// В запросе укажите допустимые значения этих переменных
// (Например если а - дробное, то b не может быть отрицательным).

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        if (sc.hasNextInt()) {
            int aInt = sc.nextInt();
            System.out.println("Введите число b (Степень)");
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                int res;
                int x = 1;
                for (int i = 0; i < b; i++) {
                    res = x * aInt;
                    x = res;
                    System.out.println(res);
                }
            } else {
                System.out.println("Нужно ввести число");
            }
        } else if (sc.hasNextDouble()) {
            double aDouble = sc.nextDouble();
            System.out.println("Введите число b (Степень)");
            if (sc.hasNextInt()) {
                int b2 = sc.nextInt();
                if (b2 > 0) {
                    double res;
                    double x = 1;
                    for (int i = 0; i < b2; i++) {
                        res = x * aDouble;
                        x = res;
                        System.out.println(res);
                    }
                } else {
                    System.out.println("Если а - дробное, то b не может быть <= 0");

                }
            } else {
                System.out.println("Неверный ввод");

            }
        } else {
            System.out.println("Я устал, я ухожу");
        }
    }
}
