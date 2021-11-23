package by.academy.homework3.Deal;

import java.util.Scanner;

public class Application {
    private static int quantityOfProd = 0;

    protected static int getQuantityOfProd() {
        return quantityOfProd;
    }

    protected static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {

        User seller = new User("Продавец", 0);
        User buyer = new User("Покупатель", 100);

        System.out.println("Добро пожаловать в магазин !");
        validateInfo(buyer);

        System.out.println("Введите сколько товара Вы планируете положить в корзину");
        if (sc1.hasNextInt()) {
            quantityOfProd = sc1.nextInt();
        } else {
            System.err.println("Неверный ввод");
            return;
        }
        ProdStorage prodStorage = new ProdStorage();
        ShoppingCart shoppingCart = new ShoppingCart();

        input(prodStorage, shoppingCart);
        Deal purchase = new Deal(seller, buyer, shoppingCart.prodInCart);
        purchase.getFullPrice();
        purchase.printBill();
        sc1.close();
    }

    protected static void validateInfo(User buyer) {
        Validator dateOfBirth = new DataValidator();
        Validator phone = new BelPhoneValidator();
        Validator email = new EmailValidator();

        System.out.println("Введите дату рождения");
        do {
            String uDate = sc1.nextLine();
            if (!dateOfBirth.isValid(uDate)) {
                System.err.println("Ошибка, повторите ввод");
            } else {

                buyer.setDateOfBirth(uDate);
            }
        } while (buyer.getDateOfBirth() == null);

        System.out.println("Введите номер телефона (+375... или 80...)");
        do {
            String uPhone = sc1.nextLine();
            if (!phone.isValid(uPhone)) {
                System.err.println("Ошибка, повторите ввод");
            } else {
                buyer.setPhone(uPhone);
            }
        } while (buyer.getPhone() == null);

        System.out.println("Введите Email");
        do {
            String uEmail = sc1.nextLine();
            if (!email.isValid(uEmail)) {
                System.err.println("Ошибка, повторите ввод");
            } else {
                buyer.setEmail(uEmail);
            }
        } while (buyer.getEmail() == null);
    }

    protected static void input(ProdStorage prodStorage, ShoppingCart shoppingCart) {
        ProdStorage pr = new ProdStorage();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quantityOfProd; ) {

            System.out.println();
            System.out.println("Введите код товара или введите '00' чтобы удалить товар ");
            System.out.println("Хлеб светлый — 01| Хлеб тёмный — 02| Сыр чеддер — 03| Молоко объемом 0.5 — 04 |");
            String num = sc.nextLine();
            switch (num) {
                case "00":
                    ShoppingCart.deleteProd(shoppingCart.prodInCart, prodStorage.products);
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
                    System.out.println("Ошибка ввода, повторите попытку");
            }
        }
    }
}
