package by.academy.homework2;

//  Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//  Если таких слов несколько, найти первое из них.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_UsingRegular {
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
        System.out.println("Кол-во слов: " + amount);

        String[] words = new String[amount];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0, j = 1; i < amount; i++, j++) {
            System.out.println("Введите слово " + j);
            words[i] = sc2.nextLine();
        }
        System.out.print("Введённые элементы:");
        for (int i = 0; i < amount; i++) {
            System.out.print("  |  " + words[i]);
        }

        int minIndex = 0, minLen = getNumMin(words[0]);
        for (int i = 0; i < words.length; i++) {
            if (getNumMin(words[i]) < minLen) {
                minIndex = i;
                minLen = getNumMin(words[i]);
            }
            if (minLen == 1) break;

        }
        System.out.println();
        System.out.println("Число различных символов минимально в строке  " + words[minIndex] +
                ", номер " + (minIndex + 1) + ", разных символов " + minLen);

        sc.close();
        sc2.close();
    }

    private static int getNumMin(String word) {
        int length = word.length();
        Pattern p = Pattern.compile("(.)(?=.*(\\1))");
        Matcher m = p.matcher(word);
        while (m.find()) length--;
        return length;
    }
}
