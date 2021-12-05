package by.academy.tasks.массивы;

// Задача 4.
// Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(9); // отрезка [1;10]
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
