package by.academy.tasks.циклы;

// Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые делятся на 5 или на 7.

public class Ex10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = " + sum);
    }
}