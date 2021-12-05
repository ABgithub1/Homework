package by.academy.tasks.массивы;

// Задача 5.
// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(6); // отрезка [0;5]
        }
        for (int i = 0; i < array2.length; i++) {
            Random random = new Random();
            array2[i] = random.nextInt(6); // отрезка [0;5]
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        double average1 = findAverage(array);
        System.out.println(average1);
        double average2 = findAverage(array2);
        System.out.println(average2);

        if (average1 > average2) {
            System.out.println("Первый больше");
        } else if (average2 > average1) {
            System.out.println("Второй больше");
        } else {
            System.out.println("Равны");
        }
    }

    protected static double findAverage(int[] a) {
        double average = 0;
        for (int j : a) {
            average += j;
        }
        average = average / a.length;
        return average;
    }
}
