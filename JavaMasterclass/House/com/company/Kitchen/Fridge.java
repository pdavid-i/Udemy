package com.company.Kitchen;

public class Fridge {
    private int nr_items;
    private String color;

    public Fridge()
    {
        this(7, "white");
    }

    public Fridge(int nr_items, String color) {
        this.nr_items = nr_items;
        this.color = color;
    }

    public void open()
    {
        System.out.println("You open your "+color+ " fridge and you look around");
        if (nr_items == 0)
            System.out.println("It is empty..");
        else if (nr_items >10)
            System.out.println("Woah you have a lot of food!");
    }

    public int getNr_items() {
        return nr_items;
    }

    public String getColor() {
        return color;
    }
}
