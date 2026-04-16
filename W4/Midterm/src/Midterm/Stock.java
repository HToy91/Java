package Midterm;

public class Stock {
    public String name;
    public String abbrev;
    public double price;
    public int quantity;
    public double holdings;

    public Stock(String name, String abbrev, double price, int quantity) {
        this.name = name;
        this.abbrev = abbrev;
        this.price = price;
        this.quantity = quantity;
        this.holdings = price * quantity;
    }
}
