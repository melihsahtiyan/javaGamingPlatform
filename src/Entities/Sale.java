package Entities;

public class Sale {
    private int id;
    private int userId;
    private String game;
    private double price;

    public Sale() {
    }

    public Sale(int id, int userId, String game, double price) {
        this.id = id;
        this.userId = userId;
        this.game = game;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
