package by.academy.tasks.циклы;

// 1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 10; i++) {
            int res = i * j;
            System.out.println(i + " в квадрате будет " + res);
            j++;
        }
    }
}
