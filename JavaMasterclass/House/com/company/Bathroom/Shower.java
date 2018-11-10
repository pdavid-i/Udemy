package com.company;

public class Shower {
    private int size;
    private String color;

    Shower(){
        this(15, "white");
    }

    public Shower(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void take()
    {
        System.out.println("You are taking a shower in the "+color+" "+size+" feet cabin!");
        System.out.println("Brrr! Its cold!");
    }
}
