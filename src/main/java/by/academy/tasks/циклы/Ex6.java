package by.academy.tasks.циклы;

// 6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int year;
        int present;
        double money;
        double formula;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кол-во лет");
        year = sc.nextInt();
        System.out.println("Введите процент");
        present = sc.nextInt();
        System.out.println("Введите кол-во руб.");
        money = sc.nextDouble();

        formula = (money * present) / 100;

        for (int i = 1; i <= year; i++) {
            double res = money + formula;
            money = res;
            System.out.println("В " + i + " год = " + res + " руб.");
        }
        sc.close();
    }
}
