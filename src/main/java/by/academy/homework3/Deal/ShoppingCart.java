package by.academy.homework3.Deal;

import java.util.Scanner;

public class ShoppingCart { // Корзина покупателя
    private static int quantityOfProd = Application.getQuantityOfProd();
    private static Scanner scanner = new Scanner(System.in);
    protected Product[] prodInCart = new Product[quantityOfProd];

    public static void deleteProd(Product[] prodInCart, Product[] products) { // products пока не используется
        System.out.println("Из какой ячейки убрать товар ? (Первая ячейка = 0)");
        int num;
        do {
            System.out.println("Введите номер ячейки для отмены");
            while (!scanner.hasNextInt()) {
                System.err.println("Ошибка ввода");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < 0);
        prodInCart[num] = null;
        System.out.println("Ячейка " + num + " удалена");
        for (Product product : prodInCart) {
            System.out.println(product);
        }
    }

    public static void addBread1ToShCart(Product[] prodInCart, Product[] products) { // Пока продукты просто создаются
        System.out.println("Какое кол-во (Хлеб тёмный) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            return;
        }
        for (int pos = 0; pos < prodInCart.length; pos++) {
            if (prodInCart[pos] == null) {
                prodInCart[pos] = new Bread("Хлеб", "Тёмный", amount, 1.50);
                break;
            }
        }
        for (Product product : prodInCart) {
            System.out.println(product);
        }
    }

    public static void addBread2ToShCart(Product[] prodInCart, Product[] products) {
        System.out.println("Какое кол-во (Хлеб Светлый) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            return;
        }
        for (int pos = 0; pos < prodInCart.length; pos++) {
            if (prodInCart[pos] == null) {
                prodInCart[pos] = new Bread("Хлеб", "Светлый", amount, 1.20);
                break;
            }
        }
        for (Product product : prodInCart) {
            System.out.println(product);
        }
    }

    public static void addCheeseToShCart(Product[] prodInCart, Product[] products) {
        System.out.println("Какое кол-во (Сыр чеддер) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            return;
        }
        for (int pos = 0; pos < prodInCart.length; pos++) {
            if (prodInCart[pos] == null) {
                prodInCart[pos] = new Cheese("Сыр", "Чеддер", amount, 4);
                break;
            }
        }
        for (Product product : prodInCart) {
            System.out.println(product);
        }
    }

    public static void addMilkToShCart(Product[] prodInCart, Product[] products) {
        System.out.println("Какое кол-во (Молоко 0.5) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            return;
        }
        for (int pos = 0; pos < prodInCart.length; pos++) {
            if (prodInCart[pos] == null) {
                prodInCart[pos] = new Milk("Молоко", 0.5, amount, 2.5);
                break;
            }
        }
        for (Product product : prodInCart) {
            System.out.println(product);
        }
    }

}
