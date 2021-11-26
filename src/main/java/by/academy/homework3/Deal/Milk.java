package by.academy.homework3.Deal;

public class Milk extends Product {
    protected double volume; //Объем бутылки

    public Milk() {
    }

    public Milk(String prodType, double volume, double quantity, double price) {
        super(prodType, quantity, price);
        this.volume = volume;
    }

    public double getProdDiscount() {
        if (quantity >= 5 && quantity <= 7) {
            return 0.9;
        } else if (quantity >= 10) {
            return 0.7;
        }
        return 1;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                ", prodType='" + prodType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
