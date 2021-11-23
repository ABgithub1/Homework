package by.academy.homework3.Deal;

public class Deal {
    protected User seller;
    protected User buyer;
    protected Product[] prodInCart;

    public Deal() {
    }

    public Deal(User seller, User buyer, Product[] prodInCart) {
        this.seller = seller;
        this.buyer = buyer;
        this.prodInCart = prodInCart;
    }

    public double getFullPrice() {
        double sum = 0;
        for (Product product : prodInCart)
            if (product != null) {
                sum += product.getProdPrice();
            }
        sum = (sum * 100) / 100;
        return sum;
    }

    public void printBill() {
        System.out.println("Число позиций: " + prodInCart.length);
        System.out.println();
        for (Product product : prodInCart) {
            System.out.println(product);
        }
        System.out.println("_______________________________________");
        System.out.println("К оплате: " + getFullPrice() + " рублей");

        double buyerMoney = buyer.getMoney() - getFullPrice();
        if (buyerMoney >= 0) {
            System.out.println("Покупка состоялась, остаток " + buyerMoney);
            System.out.println();
        } else {
            System.err.println("Недостаточно средств");
            return;
        }
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

