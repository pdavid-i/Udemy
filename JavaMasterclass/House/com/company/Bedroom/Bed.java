package com.company.Bedroom;

public class Bed {
    private int size;
    private String color;
    private int nr_of_pillows;

    public Bed() {
        this(65, "oak", 2);
    }

    public Bed(int size, String color, int nr_of_pillows) {
        this.size = size;
        this.color = color;
        this.nr_of_pillows = nr_of_pillows;
    }

    public void sleep()
    {
        System.out.println("After a long day, you go to sleep in your "+color+" "+size+" feet bed. Goodnight, space cowboy");
        if (nr_of_pillows>1)
            System.out.println("Head covered");
    }
}
