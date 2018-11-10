package model.burgers;

import model.additions.Addition;

import java.io.IOException;
import java.util.ArrayList;

public class Burger {
    protected int cap = 4;
    protected double price;
    protected String bread;
    private String meat;
    private ArrayList<Addition> extras = new ArrayList<Addition>();

    public Burger(){
        this(10, "white bread", "beef");
    }

    public Burger(String meat_p){
        this(10, "white bread", meat_p);
    }


    public Burger(double price, String bread, String meat) {
        this.price = price;
        this.bread = bread;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public boolean canAdd()
    {
        return (extras.size() < cap);
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Addition> getExtras() {
        return extras;
    }

    public String type(){
        return "Burger";
    }

    public void add(Addition extra) {
        if (this.canAdd()) {
            extras.add(extra);
            price += extra.getPrice();
        }
    }
}
