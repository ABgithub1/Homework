package by.academy.homework2;

//  Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
//  Учитываем регистр. Не использовать сортировку :)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = new String[2];
        for (int i = 0, j = 1; i < array.length; ) {
            System.out.println("Введите строку " + j);
            String str = sc.nextLine();
            if (str != null && !str.trim().isEmpty()) {
                array[i] = str;
                j++;
                i++;
            } else {
                System.out.println("Строка пуста, введите что-нибудь");
            }
        }
        System.out.print("Введённые элементы:");
        for (int i = 0; i < 2; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println();
        permutation(array);
        sc.close();
    }

    public static void permutation(String[] array) {
        if (array[0].length() != array[1].length()) {
            System.out.println("Не является, строки разной длины");
            return;
        }
        int[] letters = new int[512];
        char[] array0 = array[0].toCharArray();
        for (char c : array0) {
            letters[c]++;
        }
        for (int i = 0; i < array[1].length(); i++) {
            int c = array[1].charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                System.out.println("Не является");
                return;
            }
        }
        System.out.println("Строка является перестановкой символов другой строки");
    }
}