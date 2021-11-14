package by.academy.homework2;

// Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        do {
            System.out.println("Введите кол-во слов");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число");
                sc.next();
            }
            amount = sc.nextInt();
        } while (amount <= 0);
        Scanner sc2 = new Scanner(System.in);
        String[] array = new String[amount];
        for (int i = 0, j = 1; i < array.length; ) {
            System.out.println("Введите строку " + j);
            String str = sc2.nextLine();
            if (str != null && !str.trim().isEmpty()) {
                array[i] = str;
                j++;
                i++;
            } else {
                System.out.println("Строка пуста, введите что-нибудь");
            }
        }
        System.out.print("Введённые элементы:");
        for (int i = 0; i < amount; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println();
        sc.close();
        sc2.close();
        numOfDiffChar(array);

    }

    public static void numOfDiffChar(String[] array) {

        var charArray = new char[array.length];
        int[] charCounter = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            charArray = array[i].toCharArray();
            Arrays.sort(charArray);
            int count = 1;
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[j] != charArray[j - 1]) {
                    count++;
                }
            }
            charCounter[i] = count;
        }

        int minValue = charCounter[0];
        int index = 0;
        for (int i = 0; i < charCounter.length; i++) {
            if (charCounter[i] < minValue) {
                minValue = charCounter[i];
                index = i;
            }
        }
        System.out.println("Число различных символов минимально в строке " + array[index]);
    }
}

