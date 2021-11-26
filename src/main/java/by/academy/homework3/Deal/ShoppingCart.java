package by.academy.homework3.Deal;

import java.util.Scanner;

public class ShoppingCart { // Корзина покупателя
    private static final int quantityOfProd = Application.getQuantityOfProd();
    private static final Scanner scanner = new Scanner(System.in);
    protected Product[] prodInCart = new Product[quantityOfProd];

    public static void deleteProd(Product[] prodInCart) {
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

    public static void addBread1ToShCart(Product[] prodInCart, Product[] products) throws CloneNotSupportedException {
        System.out.println("Какое кол-во (Хлеб тёмный) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (products[0].getQuantity() >= amount) {
                for (int pos = 0; pos < prodInCart.length; pos++) {
                    if (prodInCart[pos] == null) {
                        prodInCart[pos] = (Product) products[0].clone();
                        ProdStorage.decreaseProd0(products, amount);
                        prodInCart[pos].setQuantity(amount);
                        break;
                    }
                }
            } else {
                System.err.println("В наличии только " + products[0].getQuantity() + " продуктов");
                return;
            }
        } else {
            System.err.println("Ошибка ввода");
            return;
        }
        System.out.println("_________________________________________________________");
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_________________________________________________________");
    }

    public static void addBread2ToShCart(Product[] prodInCart, Product[] products) throws CloneNotSupportedException {
        System.out.println("Какое кол-во (Хлеб светлый) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (products[1].getQuantity() >= amount) {
                for (int pos = 0; pos < prodInCart.length; pos++) {
                    if (prodInCart[pos] == null) {
                        prodInCart[pos] = (Product) products[1].clone();
                        ProdStorage.decreaseProd1(products, amount);
                        prodInCart[pos].setQuantity(amount);
                        break;
                    }
                }
            } else {
                System.err.println("В наличии только " + products[1].getQuantity() + " продуктов");
                return;
            }
        } else {
            System.err.println("Ошибка ввода");
            return;
        }
        System.out.println("_________________________________________________________");
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_________________________________________________________");
    }

    public static void addCheeseToShCart(Product[] prodInCart, Product[] products) throws CloneNotSupportedException {
        System.out.println("Какое кол-во (Сыр чеддер) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (products[2].getQuantity() >= amount) {
                for (int pos = 0; pos < prodInCart.length; pos++) {
                    if (prodInCart[pos] == null) {
                        prodInCart[pos] = (Product) products[2].clone();
                        ProdStorage.decreaseProd2(products, amount);
                        prodInCart[pos].setQuantity(amount);
                        break;
                    }
                }
            } else {
                System.err.println("В наличии только " + products[2].getQuantity() + " продуктов");
                return;
            }
        } else {
            System.err.println("Ошибка ввода");
            return;
        }
        System.out.println("_________________________________________________________");
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_________________________________________________________");
    }

    public static void addMilkToShCart(Product[] prodInCart, Product[] products) throws CloneNotSupportedException {
        System.out.println("Какое кол-во (Молоко 0.5) вы хотите купить ?");
        int amount = 0;
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
            if (products[3].getQuantity() >= amount) {
                for (int pos = 0; pos < prodInCart.length; pos++) {
                    if (prodInCart[pos] == null) {
                        prodInCart[pos] = (Product) products[3].clone();
                        ProdStorage.decreaseProd3(products, amount);
                        prodInCart[pos].setQuantity(amount);
                        break;
                    }
                }
            } else {
                System.err.println("В наличии только " + products[3].getQuantity() + " продуктов");
                return;
            }
        } else {
            System.err.println("Ошибка ввода");
            return;
        }
        System.out.println("_________________________________________________________");
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_________________________________________________________");
    }

}

