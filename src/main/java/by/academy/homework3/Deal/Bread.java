package by.academy.homework3.Deal;

public class Bread extends Product implements Cloneable {
    protected String breadType; // Светлый / Тёмный

    public Bread() {
    }

    public Bread(String prodType, String breadType, double quantity, double price) {
        super("Хлеб", quantity, price);
        this.breadType = breadType;
    }

    public double getProdDiscount() {
        if (quantity > 10) {
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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