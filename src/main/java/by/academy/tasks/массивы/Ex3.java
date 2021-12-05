package by.academy.tasks.массивы;

// Задача 3.
// Создайте массив из 15 случайных целых чисел из отрезка [0;9].
// Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10); // отрезка [0;9]
            if (array[i] > 0 && array[i] % 2 == 0) {
                counter++;
            }
        }
        int[] array2 = new int[counter];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Кол-во четных " + counter);
        System.out.println("Вот они");
        System.out.println(Arrays.toString(array2));
    }
}
