package by.academy.homework1;
//Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
public class Task4 {
    public static void main(String[] args) {
        int res = 0;
        int num = 1;
        System.out.println("Возвожу число 2 в степени");
        System.out.println("Степень: 0  Любое число в нулевой степени равно 1 (Кроме нуля :))");
        for (int i = 1; res < 1_000_000; i++) {
            res = num * 2;
            num = res;
            System.out.println("Степень: " + i + " " + " Результат возведения: " + res);
        }
    }
}

