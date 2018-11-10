package com.company.LivingRoom;

public class Bookshelf {
    private int nr_of_books;

    Bookshelf(){
        this(20);
    }

    Bookshelf(int number)
    {
        this.nr_of_books = number;
    }

    private int getBooks()
    {
        return nr_of_books;
    }

    public void read()
    {
        System.out.println("Wow, you have " + nr_of_books +" books! How many have you read? ");
    }
}
