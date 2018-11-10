package com.company;

public class Bathroom extends Room{
    private Toilet wc;
    private Shower dus;
    private Sink veta;

    public Bathroom() {
        this(100, "white", new Toilet(), new Shower(), new Sink());
    }

    public Bathroom(int size, String color, Toilet wc, Shower dus, Sink veta) {
        super(size, color);
        this.wc = wc;
        this.dus = dus;
        this.veta = veta;
    }

    @Override
    public void tour(){
        System.out.println("______________________________________________________");

        System.out.println("Welcome to your "+super.getColor() + " "+super.getSize() + "feet bathroom!");
        wc.flush();
        veta.wash();
        dus.take();
        System.out.println("______________________________________________________");

    }

    public Toilet getWc() {
        return wc;
    }

    public Shower getDus() {
        return dus;
    }

    public Sink getVeta() {
        return veta;
    }
}
