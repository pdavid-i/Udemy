package com.company.Kitchen;

import com.company.Room;

public class Kitchen extends Room {
    private Cooker aragaz;
    private Fridge frigi;

    public Kitchen() {
        this.aragaz = new Cooker();
        this.frigi = new Fridge();
    }

    public Kitchen(int size, String color, Cooker aragaz, Fridge frigi) {
        super(size, color);
        this.aragaz = aragaz;
        this.frigi = frigi;
    }

    @Override
    public void tour()
    {
        System.out.println("______________________________________________________");
        System.out.println("You enter your "+super.getColor()+" "+super.getSize()+" kitchen!");
        frigi.open();
        aragaz.cook();
        System.out.println("______________________________________________________");

    }

    public Cooker getAragaz() {
        return aragaz;
    }

    public Fridge getFrigi() {
        return frigi;
    }
}
