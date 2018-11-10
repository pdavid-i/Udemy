package view;

import model.additions.Addition;
import model.burgers.Burger;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class UI {
    public UI() {
    }

    ;

    public static int getInteger() {
        System.out.print("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void add(Addition extra, double t) {
        System.out.println(extra.getName() + " has been added to your burger for " + extra.getPrice() + ". Total is now: " + t);
    }

    public static void invalidInput() {
        System.out.println("Your input is invalid! Try again!");
    }

    public static void printOptions() {
        System.out.println("1.Basic burger   - add up to 4 ingredients of your choice!     - 10$ ");
        System.out.println("2.Healthy burger - with brown bread and up to 6 additions!     - 12.5$ ");
        System.out.println("3.Deluxe burger - the burger you love with chips and drinks!   - 14$");
    }

    public static void printExtras() {
        System.out.println("0. No extras");
        System.out.println("1. Cheese - 1$");
        System.out.println("2. Bacon - 2$");
        System.out.println("3. Jalapeño - 0.5$");
        System.out.println("4. Fries - 2$");
        System.out.println("5. Soda - 1.75$");
    }

    public static void printMeat()
    {
        System.out.println("1. Beef");
        System.out.println("2. Chicken");
        System.out.println("3. Pork");
    }

    public static void deliver(Burger b)
    {
        System.out.print("Your "+ b.getMeat() + " " + b.type()+ " on " + b.getBread());
        if (b.getExtras().size() != 0)
            System.out.print(" with ");
        for (int i=0; i<b.getExtras().size(); i++) {
            System.out.print(b.getExtras().get(i).getName());
            if (i == (b.getExtras().size() - 2)) {
                System.out.print(" and ");
            } else if (i < b.getExtras().size() - 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" is ready! Total cost: "+b.getPrice()+ "$ Enjoy your meal!");
    }
}
