package com.company.LivingRoom;

public class Couch {
    private int size;
    private boolean isSoft;
    private String color;

    public Couch()
    {
        this(12, true, "orange");
    }

    public Couch(int size, boolean isSoft, String color) {
        this.size = size;
        this.isSoft = isSoft;
        this.color = color;
    }

    public void nap(){
        System.out.print("You lie down in your "+color+" "+size+" feet sofa. ZZZZzzz");
        if (isSoft)
            System.out.println("Knock yourself out");
        else
            System.out.println("Trully good things are worth waiting for");
    }

    public int getSize() {
        return size;
    }

    public boolean isSoft() {
        return isSoft;
    }

    public String getColor() {
        return color;
    }
}
