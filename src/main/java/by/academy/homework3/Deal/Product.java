package by.academy.homework3.Deal;

public class Product {
    protected String prodType;
    protected double quantity;
    protected double price;

    public Product() {
    }

    public Product(String prodType, double quantity, double price) {
        super();
        this.prodType = prodType;
        this.quantity = quantity;
        this.price = price;
    }

    public double getProdPrice() {
        return price * quantity * getProdDiscount();
    }

    public double getProdDiscount() {
        double num = 0;
        if (quantity >= 1 && quantity < 3) {
            num = 1;
        } else if (quantity >= 3 && quantity < 7) {
            num = 0.9;
        } else if (quantity >= 7 && quantity < 10) {
            num = 0.7;
        } else {
            num = 0.5;
        }
        return num;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public double getQuantity() {

        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
