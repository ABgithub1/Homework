package by.academy.tasks.операторы;

//3. Создайте число. Определите, является ли число четным или не четным,
//вывести текстовое сообщение.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("Число " + number + " являятся четным");
            } else {
                System.out.println("Число " + number + " не являятся четным");
            }
        } else {
            System.out.println("Это не число");
        }
    }
}
