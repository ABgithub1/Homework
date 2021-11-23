package by.academy.homework3.Deal;

public class Bread extends Product {
    protected String breadType; // Светлый / Тёмный

    public Bread() {
    }

    public Bread(String prodType, String breadType, double quantity, double price) {
        super("Хлеб", quantity, price);
        this.breadType = breadType;
    }

    public double getProdDiscount() {
        if (quantity > 20) {
            return 0.6;
        }
        return 1;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                ", prodType='" + prodType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}