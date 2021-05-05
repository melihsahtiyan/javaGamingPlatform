package Entities;

public class Campaign extends Sale {
    private int discount;
    private double priceAfterSale;

    public Campaign() {
    }

    public Campaign(int id, int userId, String game, double price, int discount) {
        super(id, userId, game, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getPriceAfterSale() {
        return getPrice() - (getPrice()*discount/100);
    }

}
