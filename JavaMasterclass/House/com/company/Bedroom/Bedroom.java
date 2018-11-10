package com.company.Bedroom;

import com.company.Room;

public class Bedroom extends Room {
    private Bed bed;

    public Bedroom()
    {
        this(new Bed());
    }

    public Bedroom(Bed bed_p)
    {
        this.bed =  bed_p;
    }

    @Override
    public void tour()
    {
        System.out.println("______________________________________________________");
        System.out.println("You enter your "+super.getColor() + " " + super.getSize() + " feet bedroom");
        bed.sleep();
        System.out.println("______________________________________________________");
    }
}
