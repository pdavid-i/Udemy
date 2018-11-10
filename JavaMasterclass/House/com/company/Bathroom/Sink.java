package com.company;

public class Sink {
    private int faucets;
    private String color;

    public Sink() {
        this(1, "white");
    }

    public Sink(int faucets, String color) {
        this.faucets = faucets;
        this.color = color;
    }

    public void wash()
    {
        System.out.print("You wash your hands in your "+color+" sink with ");
        if (faucets == 1)
            System.out.println("1 faucet");
        else
            System.out.println(faucets + "faucets");
        System.out.println("Yay hygiene!");
    }

    public int getFaucets() {
        return faucets;
    }

    public String getColor() {
        return color;
    }
}
