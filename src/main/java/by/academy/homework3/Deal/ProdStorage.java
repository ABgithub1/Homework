package by.academy.homework3.Deal;

// Пока ещё не доделал
public class ProdStorage { // Прилавок / склад
    int numberOfProducts = 4;
    protected Product[] products = new Product[numberOfProducts];

    public static void createProd(Product[] products) {
        products[0] = new Bread("Хлеб", "Тёмный", 10, 1.50);
        products[1] = new Bread("Хлеб", "Светлый", 10, 1.50);
        products[2] = new Cheese("Сыр", "Чеддер", 10, 4);
        products[3] = new Milk("Молоко", 0.5, 10, 2.5);

 /*
            for (Product product : products) {
            System.out.println(product);
        }
 */
    }
}



