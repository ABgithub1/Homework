package by.academy.tasks.операторы;

//0. Ввести через консоль название месяца -> вывести номер месяца (использовать switch/case)

import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи номер дня");
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("С таким номером не существует");
        }
    }
}
