package by.academy.tasks.циклы;

// 18. Задано натуральное число N.
// Найти количество натуральных чисел,
// не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Введите N");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.err.println("Ошибка ввода");
        }
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                counter++;
            }
        }
        System.out.println("Количество натуральных чисел,\n" +
                "не превосходящих N и не делящихся ни на одно из чисел 2,3,5 = " + counter );
    }
}
