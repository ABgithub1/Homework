package by.academy.tasks.циклы;

// 17. В ЭВМ вводятся по очереди данные о росте N учащихся класса.
// Определить средний рост учащихся класса.

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = 0;
        do {
            System.out.println("Введите кол-во людей");
            if (sc.hasNextInt()) {
                person = sc.nextInt();
            } else {
                System.err.println("Ошибка ввода");
            }
        } while (person <= 0);
        double res = 0;
        for (int i = 0, j = 1; i < person; i++) {
            System.out.println("Введите рост");
            if (sc.hasNextDouble()) {
                double height = sc.nextDouble();
                res = res + height;
                System.out.println("Рост " + j + " : " + res);
            } else {
                System.err.println("Ошибка ввода, повторите ввод");
                i--;
            }
        }
        double answer = res / person;
        System.out.println("Ответ: " + answer);
    }
}
