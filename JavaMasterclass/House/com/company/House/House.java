package com.company;

import com.company.Bedroom.Bedroom;
import com.company.Kitchen.Kitchen;
import com.company.LivingRoom.Living;

public class House {
    private Bathroom baie;
    private Living sufra;
    private Bedroom dormitor;
    private Kitchen buca;

    public House()
    {
        this(new Bathroom(), new Living(), new Bedroom(), new Kitchen());
    }

    public House(Bathroom baie, Living sufra, Bedroom dormitor, Kitchen buca) {
        this.baie = baie;
        this.sufra = sufra;
        this.dormitor = dormitor;
        this.buca = buca;
    }

    public void visit(){
        baie.tour();
        buca.tour();
        sufra.tour();
        dormitor.tour();
    }

}
