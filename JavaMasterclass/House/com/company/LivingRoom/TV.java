package com.company.LivingRoom;

public class TV {
    private int size;
    private String color;

    public TV(){
        this(7, "black");
    }

    public TV(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void watch(){
        System.out.println("You turn on your "+color+" "+size+"inches TV!");
        System.out.println("Seems like only 'Friends' is on. Yikes");
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}

