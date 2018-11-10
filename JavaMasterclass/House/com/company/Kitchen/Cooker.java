package com.company.Kitchen;

public class Cooker
{
    private int degrees;
    private String color;

    public Cooker()
    {
        this(450, "black");
    }

    public Cooker(int degrees, String color) {
        this.degrees = degrees;
        this.color = color;
    }

    public void cook()
    {
        System.out.println("You cook at your "+color+" "+degrees+" cooker! Yummy!");
    }

    public int getDegrees() {
        return degrees;
    }

    public String getColor() {
        return color;
    }
}
