package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {       //Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести с консоли число от 1 до 10");
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            sc.close();
        } else {
            System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
            return;
        }
        if (number >= 1 && number <= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
            }
        } else {
            System.out.println("Неверный ввод. Необходимо ввести число от 1 до 10. Перезапустите программу и попробуйте снова!");
        }
    }
}

