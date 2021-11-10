package by.academy.tasks.циклы;

// 2. Составьте программу, которая вычисляет сумму чисел от 1 до n. Значение n вводится с клавиатуры.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = 0;
        int sum = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }else{
            System.out.println("Неверный ввод");
        }
        for(int i = 1; i < n; i++) {
            System.out.print(i + "+");
            sum += i;
        }
        sum += n;
        System.out.print(n + "=" + sum);
        sc.close();
    }
}
