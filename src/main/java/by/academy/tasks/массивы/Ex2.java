package by.academy.tasks.массивы;

// Задача 2.
// Создайте массив из всех нечётных чисел от 1 до 99,
// выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] numArray = new int[50];
        for (int i = 1, j = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                numArray[j] = i;
                j++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(numArray));
        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.println(numArray[i]);
        }
    }
}

