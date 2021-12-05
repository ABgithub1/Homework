package by.academy.tasks.циклы;

// 16. В бригаде, работающей на уборке сена, имеется N сенокосилок.
// Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
// Сколько часов проработала вся бригада?

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите кол-во N (сенокосилок)");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.err.println("Ошибка ввода");
            }
        } while (n <= 0);
        int m = 0;
        do {
            System.out.println("Введите кол-во M (Часов)");
            if (sc.hasNextInt()) {
                m = sc.nextInt();
                m = m * 60;
            } else {
                System.err.println("Ошибка ввода");
            }
        } while (m <= 0);

        int res = 0;
        int min = 0;
        int x;
        for (int i = 0; i < n; i++) {
            x = m + min;
            res = res + x;
            min += 10;
            System.out.println(res);
        }
        // доделать вывод времени !!!
    }
}
