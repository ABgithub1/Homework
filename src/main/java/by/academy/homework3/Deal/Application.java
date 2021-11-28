package by.academy.homework3.Deal;

import java.text.ParseException;
import java.util.Scanner;


public class Application {
    private static int quantityOfProd = 0;

    protected static int getQuantityOfProd() {
        return quantityOfProd;
    }

    protected static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        System.out.println("Добро пожаловать в магазин !");

        User seller = new User("Продавец", 0);
        User buyer = new User("Покупатель", 100);

        Info.validateInfo(buyer);

        System.out.println("Введите сколько товара Вы планируете положить в корзину");
        if (scan.hasNextInt()) {
            quantityOfProd = scan.nextInt();
        } else {
            System.err.println("Неверный ввод");
            return;
        }
        ProdStorage prodStorage = new ProdStorage();
        ProdStorage.createProd(prodStorage.products);

        ShoppingCart shoppingCart = new ShoppingCart();

        input(prodStorage, shoppingCart);

        Deal purchase = new Deal(seller, buyer, shoppingCart.prodInCart);
        purchase.getFullPrice();
        purchase.increaseDecreaseMoney();
        purchase.printBill();
        scan.close();
    }

    protected static void input(ProdStorage prodStorage, ShoppingCart shoppingCart) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quantityOfProd; ) {
            System.out.println();
            System.out.println("Введите код товара или введите '00' чтобы удалить товар ");
            System.out.println("Хлеб тёмный — 01| Хлеб светлый — 02| Сыр чеддер — 03| Молоко объемом 0.5 — 04 |");
            String num = sc.nextLine();
            switch (num) {
                case "00":
                    ShoppingCart.deleteProd(shoppingCart.prodInCart);
                    i--;
                    break;

                case "01":
                    ShoppingCart.addBread1ToShCart(shoppingCart.prodInCart, prodStorage.products);
                    i++;
                    break;

                case "02":
                    ShoppingCart.addBread2ToShCart(shoppingCart.prodInCart, prodStorage.products);
                    i++;
                    break;

                case "03":
                    ShoppingCart.addCheeseToShCart(shoppingCart.prodInCart, prodStorage.products);
                    i++;
                    break;

                case "04":
                    ShoppingCart.addMilkToShCart(shoppingCart.prodInCart, prodStorage.products);
                    i++;
                    break;
                default:
                    System.err.println("Ошибка ввода, повторите попытку");
            }
        }
    }
}
