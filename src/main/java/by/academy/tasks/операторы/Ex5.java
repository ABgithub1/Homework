package by.academy.tasks.операторы;

import java.util.Scanner;

//5. Ввести с консоли 2 числа, найти большее, меньшее, среднее арифметическое.

// Попробовал сделать с методами и массивом, это было долго

public class Ex5 {
    public static void main(String[] args) {
        //Создание и заполнение массива
        int[] array = new int[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0, b = 1; i < 2; i++) {
            System.out.println("Введите число " + b);
            array[i] = sc.nextInt();
            b++;
        }
        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Минимум: " + max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("Максимум: " + min);

        // Вызов метода arithmetic () для получения минимального значения
        double arithmetic = getArithmetic(array);
        System.out.println("Среднее арифметическое: " + arithmetic);
    }

    //здесь находим максимум
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // здесь находим минимум
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    // Среднее арифметическое
    public static double getArithmetic(int[] inputArray) {
        double arithmetic = 0;
        for (int i = 0; i < 2; i++) {
            arithmetic += inputArray[i];
        }
        arithmetic /= 2;
        return arithmetic;
    }
}