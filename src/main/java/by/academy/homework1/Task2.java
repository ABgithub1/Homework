package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных (Integer/Double/Float/Char/String)");
        String input = sc.nextLine();

        switch (input) {

            case "Integer":
                System.out.println("Case Integer");
                System.out.println("Найдём остаток от деления числа X на число Y");
                System.out.println("Введите число X");
                int numX;
                int numY;
                if (sc.hasNextInt()) {
                    numX = sc.nextInt();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println("Введите число Y");
                if (sc.hasNextInt()) {
                    numY = sc.nextInt();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println("Остаток от деления числа " + numX + " на " + numY + " равен: " + numX % numY);
                break;

            case "Double":
                double numDb;
                double pr;
                System.out.println("Case Double");
                System.out.println("Вычисление процента от числа");
                System.out.println("Введите число");
                if (sc.hasNextDouble()) {
                    numDb = sc.nextDouble();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println("Сколько процентов нужно вычислить ?");
                if (sc.hasNextDouble()) {
                    pr = sc.nextDouble();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println(pr + " % от " + numDb + " будет " + pr / 100 * numDb);
                break;

            case "Float":
                float numFl;
                System.out.println("Case Float");
                System.out.println("Возведение в квадрат");
                System.out.println("Введите число");
                if (sc.hasNextFloat()) {
                    numFl = sc.nextFloat();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println(numFl + " В квадрате равно " + numFl * numFl); // Вначале хотел сделать через метод
                // Math.pow() , но он вроде для Double
                break;

            case "Char":
                System.out.println("Case Char");
                System.out.println("Введите символ (один)");
                char symbol = sc.next().charAt(0);
                System.out.println("HTML-код" + " символа " + symbol + " = " + (int) symbol);
                break;

            case "String":
                String str;
                System.out.println("Case String");
                System.out.println("Введите строку");
                if (sc.hasNext()) {
                    str = sc.next();
                } else {
                    System.out.println("Неверный ввод. Перезапустите программу и попробуйте снова!");
                    break;
                }
                System.out.println("Hello " + str);
                break;

            default:
                System.out.println("Ошибка ввода");
        }
        sc.close();
    }
}
