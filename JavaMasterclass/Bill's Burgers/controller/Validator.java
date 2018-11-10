package controller;

public class Validator {

    public static boolean validate_burger_choice(int n)
    {
        return (n>=1 && n<=3);
    }


    public static boolean validate_extra(int n){
        return (n>=0 && n<=5);
    }
}
