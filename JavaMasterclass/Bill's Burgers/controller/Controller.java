package controller;
import model.additions.Addition;
import model.burgers.Burger;
import model.burgers.DeluxeBurger;
import model.burgers.HealthyBurger;
import view.UI;

public class Controller {

    public Controller(){};

    public Burger getBurger()
    {
        UI.printOptions();
        int choice = UI.getInteger();
        if (!Validator.validate_burger_choice(choice))
        {
            UI.invalidInput();
            return getBurger();
        }
        String meat = getMeat();
        switch (choice)
        {
            case 1:
                return new Burger(meat);
            case 2:
                return new HealthyBurger(meat);
            case 3:
                return new DeluxeBurger(meat);
        }
        return new Burger();
    }

    public String getMeat()
    {
        UI.printMeat();
        int choice = UI.getInteger();
        if (!Validator.validate_burger_choice(choice))
        {
            UI.invalidInput();
            return getMeat();
        }
        switch(choice){
            case 1: return "beef";
            case 2:return "chicken";
            case 3:return "pork";
        }
        return "soy";
    }

    public void addExtras(Burger burger)
    {
        if (!burger.canAdd())
            return;
        int choice = UI.getInteger();
        if (!Validator.validate_extra(choice))
        {
            UI.invalidInput();
            UI.printExtras();
            this.addExtras(burger);
            return;
        }
        Addition extra = new Addition("sample", 0);
        switch(choice)
        {
            case 0:
                return;
            case 1:
                extra = new Addition("cheese", 1);break;
            case 2:
                extra = new Addition("bacon", 2);break;
            case 3:
                extra = new Addition("jalapeño", 0.5);break;
            case 4:
                extra = new Addition("fries", 2);break;
            case 5:
                extra = new Addition("soda", 1.75);break;
        }
        burger.add(extra);
        UI.add(extra, burger.getPrice());
        this.addExtras(burger);
    }

    public void order()
    {
        Burger burger = this.getBurger();
        if (burger.type() != "Deluxe Burger") {
            UI.printExtras();
            this.addExtras(burger);
        }
        UI.deliver(burger);
    }
}
