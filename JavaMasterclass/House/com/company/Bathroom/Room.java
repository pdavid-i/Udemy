package com.company;

public class Room {
    private int size;
    private String color;

    public Room(){
        this(100, "white");
    }

    public Room(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void tour(){

    }
}
