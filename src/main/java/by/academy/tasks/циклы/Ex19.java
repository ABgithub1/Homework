package by.academy.tasks.циклы;

// 19. Два двузначных числа, записанных одно за другим,
// образуют четырёхзначное число, которое делится на их произведение.
// Найти эти числа.

public class Ex19 {
    public static void main(String[] args) {
        for (int a = 10; a < 100; a++) {
            for (int b = 10; b < 100 ; b++) {
                int c = a*100+b;
                if (c%(a*b)==0){
                    System.out.println(a);
                    System.out.println(b);
                }

            }
        }
    }
}
