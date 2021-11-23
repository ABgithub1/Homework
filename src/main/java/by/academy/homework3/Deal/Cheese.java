package by.academy.homework3.Deal;

public class Cheese extends Product {
    protected String cheeseType;

    public Cheese() {
    }

    public Cheese(String prodType, String cheeseType, double quantity, double price) {
        super(prodType, quantity, price);
        this.cheeseType = cheeseType;
    }

    public double getProdDiscount() {
        if (quantity > 7) {
            return 0.8;
        }
        return 1;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "cheeseType='" + cheeseType + '\'' +
                ", prodType='" + prodType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
