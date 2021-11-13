package by.academy.tasks.циклы;

// 11. Напечатать те из двузначных чисел которые делятся на 4, но не делятся на 6.

public class Ex11 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (i % 4 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
    }
}
