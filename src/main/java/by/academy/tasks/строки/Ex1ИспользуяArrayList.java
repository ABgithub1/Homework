package by.academy.tasks.строки;

// Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1ИспользуяArrayList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 1. Создай список строк.
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Введите кол-во строк");
        int size = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        for (int i = 0, j = 1; i < size; i++, j++) {
            System.out.println("Введите строку " + j);
            list.add(sc2.nextLine());
        }
        // 3. Используя цикл, найди самую короткую строку в списке.
        int min = list.get(0).length();
        for (String s : list)
            if (s.length() < min)
                min = s.length();
        // 4. Выведи найденную строку на экран.
        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (String s : list)
            if (s.length() == min)
                System.out.println("Минимальная " + s);

        int max = list.get(0).length();
        for (String s : list)
            if (s.length() > max)
                max = s.length();
        // 4. Выведи найденную строку на экран.
        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (String s : list)
            if (s.length() == max)
                System.out.println("максимальная " +s);

        sc.close();
        sc2.close();
    }
}