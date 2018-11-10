package com.company;

public class Toilet {
    private double size;
    private String color;

    public Toilet() {
        this(6, "white");
    }

    public Toilet(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public void flush()
    {
        System.out.println("You flushed your "+color+" "+size+" feet toilet!");
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
