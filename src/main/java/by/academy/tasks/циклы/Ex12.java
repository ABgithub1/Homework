package by.academy.tasks.циклы;

// Найти произведение двузначных нечетных чисел кратных 13.

public class Ex12 {
    public static void main(String[] args) {
        int res = 1;
        for (int i = 10; i <= 99; i++) {
            if (i % 2 != 0 && i % 13 == 0) {
                res = res * i;
                System.out.print(i + " * ");
            }
        }
        System.out.print(" = " + res);
    }
}
