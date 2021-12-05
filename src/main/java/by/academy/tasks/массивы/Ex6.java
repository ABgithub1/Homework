package by.academy.tasks.массивы;

// Задача 6.
// Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 89 + 10);
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            if (array[i] >= array[j]) {
                System.err.println("Последовательность не возрастающая");
                break;
            }
        }
    }
}
