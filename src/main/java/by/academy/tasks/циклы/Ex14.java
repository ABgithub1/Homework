package by.academy.tasks.циклы;

// Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = sc.nextInt();
        int sum = 0;
        int square;
        for (int i = 1; i <= num; i++) {
            square = i * i;
            sum = sum + square;
            System.out.println(square);
        }
        System.out.println("сумма квадратов чисел  =  " + sum);
    }
}
