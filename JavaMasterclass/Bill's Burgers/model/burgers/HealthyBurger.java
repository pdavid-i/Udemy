package model.burgers;

public class HealthyBurger extends Burger {
    public HealthyBurger(String meat)
    {
        super(meat);
        this.bread = "brown bread";
        this.cap = 6;
        this.price = 12.5;
    }

    @Override
    public String type(){
        return "Healthy burger";
    }
}
