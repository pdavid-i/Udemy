package model.additions;

public class Addition {
    private double price;
    private String name;

    public Addition(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getName()
    {
        return this.name;
    }
}
