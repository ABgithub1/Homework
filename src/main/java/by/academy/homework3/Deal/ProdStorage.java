package by.academy.homework3.Deal;

public class ProdStorage { // Прилавок / склад
    int numberOfProducts = 5;
    protected Product[] products = new Product[numberOfProducts];

    public static void createProd(Product[] products) {
        products[0] = new Bread("Хлеб", "Тёмный", 50, 1.50);
        products[1] = new Bread("Хлеб", "Светлый", 50, 1.50);
        products[2] = new Cheese("Сыр", "Чеддер", 50, 4);
        products[3] = new Milk("Молоко", 0.5, 50, 2.5);
    }

    public static void decreaseProd0(Product[] products, int amount) {
        products[0].setQuantity(products[0].getQuantity() - amount);
    }

    public static void decreaseProd1(Product[] products, int amount) {
        products[1].setQuantity(products[1].getQuantity() - amount);
    }

    public static void decreaseProd2(Product[] products, int amount) {
        products[2].setQuantity(products[2].getQuantity() - amount);
    }

    public static void decreaseProd3(Product[] products, int amount) {
        products[3].setQuantity(products[3].getQuantity() - amount);
    }
}




