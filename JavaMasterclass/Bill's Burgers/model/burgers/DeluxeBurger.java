package model.burgers;

import model.additions.Addition;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(String meat){
        super(meat);
        this.add(new Addition( "chips", 0));
        this.add(new Addition( "drinks", 0));
        this.cap = 0;
        this.price = 14;
    }

    @Override
    public String type(){
        return "Deluxe burger";
    }
}
