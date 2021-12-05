package by.academy.tasks.массивы;

// Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//Перед созданием массива подумайте, какого он будет размера.
//2 4 6 … 18 20
//2
//4
//6
//…
//20

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        for (int i = 2, j = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                numArray[j] = i;
                j++;
            }
        }
        for (int j : numArray) {
            System.out.println(j);
        }
        System.out.println();
        System.out.println(Arrays.toString(numArray));
    }
}
