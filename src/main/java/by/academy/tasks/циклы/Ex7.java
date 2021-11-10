package by.academy.tasks.циклы;

// Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();

        for (int i = 1, j = 2; i < 10; i++, j++) {
            if (a > b) {
                System.out.println("Певое больше второго");
            } else if (a < b) {
                System.out.println("Второе больше первого");
            } else {
                System.out.println("Они равны");
            }
            System.out.println();
            System.out.println("Введите " + j + " пару");
            System.out.println("Введите первое число");
            a = sc.nextInt();
            System.out.println("Введите второе число");
            b = sc.nextInt();
        }
        if (a > b) {
            System.out.println("Певое больше второго");
        } else if (a < b) {
            System.out.println("Второе больше первого");
        } else {
            System.out.println("Они равны");
        }
        sc.close();
    }
}
