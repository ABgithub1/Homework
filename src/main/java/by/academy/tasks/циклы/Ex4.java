package by.academy.tasks.циклы;

// 4. С клавиатуры вводятся n чисел.
// Составьте программу, которая определяет кол-во отрицательных,
// кол-во положительных и кол-во нулей среди введеных чисел.
// Значение n вводится с клавиатуры.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введте число n");
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i = 0, j=1; i < n; i++,j++){
                System.out.println("Введите число " + j);
                if (sc.hasNextInt()){
                    number = sc.nextInt();
                    if (number > 0){
                        positive++;
                    }else if (number < 0){
                        negative++;
                    }else {
                        zero++;
                    }
                }else {
                    System.out.println("Неверный ввод");
                    return;
                }
            }
        }else{
            System.out.println("Неверный ввод");
            return;
        }
        System.out.println("Положительных: "+ positive);
        System.out.println("Отрицательных: "+ negative);
        System.out.println("Нулей: "+ zero);
        sc.close();
    }
}
