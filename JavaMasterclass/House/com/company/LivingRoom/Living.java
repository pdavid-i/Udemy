package com.company.LivingRoom;

import com.company.Room;

public class Living extends Room {
    private TV tele;
    private Couch sofa;
    private Bookshelf biblio;

    public Living() {
        this(new TV(), new Couch(), new Bookshelf());
    }

    public Living(TV tele, Couch sofa, Bookshelf biblio) {
        this.tele = tele;
        this.sofa = sofa;
        this.biblio = biblio;
    }

    @Override
    public void tour() {
        System.out.println("______________________________________________________");
        System.out.println("Welcome to your "+super.getColor() + " " + getSize()+" living room!");
        getTV().watch();
        getSofa().nap();
        getBiblio().read();
        System.out.println("______________________________________________________");
    }

    public TV getTV() {
        return tele;
    }

    public Couch getSofa() {
        return sofa;
    }

    public Bookshelf getBiblio() {
        return biblio;
    }
}
