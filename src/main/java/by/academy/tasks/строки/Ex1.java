package by.academy.tasks.строки;

// 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кол-во строк ");
        int numberOfStrings = sc.nextInt();
        sc.nextLine();
        String min = null;
        String max = null;
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Введите строку: ");
            String str = sc.next();

            if (min == null) {
                min = str;
            }

            if (max == null) {
                max = str;
            }

            if (str.length() > max.length()) {
                max = str;
            }

            if (str.length() < min.length()) {
                min = str;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Min длина: " + min.length());

        System.out.println("Max: " + max);
        System.out.println("Max длина: " + max.length());

        sc.close();
    }

}

