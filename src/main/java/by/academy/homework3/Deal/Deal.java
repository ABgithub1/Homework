package by.academy.homework3.Deal;

public class Deal {
    protected User seller;
    protected User buyer;
    protected Product[] prodInCart;

    public Deal() {
    }

    protected Deal(User seller, User buyer, Product[] prodInCart) {
        this.seller = seller;
        this.buyer = buyer;
        this.prodInCart = prodInCart;
    }

    protected double getFullPrice() {
        double sum = 0;
        for (Product product : prodInCart)
            if (product != null) {
                sum += product.getProdPrice();
            }
        sum = (sum * 100) / 100;
        return sum;
    }

    protected void increaseDecreaseMoney() {
        if (buyer.getMoney() >= getFullPrice()) {
            buyer.setMoney(buyer.getMoney() - getFullPrice());
            seller.setMoney(seller.getMoney() + getFullPrice());
        } else {
            System.err.println("Недостаточно средств. У вас в наличии " + buyer.getMoney());
            return;
        }

    }

    protected void printBill() {
        System.out.println("Число позиций: " + prodInCart.length);
        System.out.println();
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_______________________________________");
        System.out.println("К оплате: " + getFullPrice() + " рублей");
        System.out.println("Покупка состоялась, остаток: " + buyer.getMoney());
    }


    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProdInCart() {
        return prodInCart;
    }

    public void setProdInCart(Product[] prodInCart) {
        this.prodInCart = prodInCart;
    }
}

