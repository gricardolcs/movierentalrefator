package com.jalasoft;

public class Main
{
    public static void main(String[] args){
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Zack Snyder's Justice League",
            new RegularPrice()), 5));
        customer.addRental(new Rental(new Movie("Terminator", new RegularPrice()), 1));
        customer.addRental(new Rental(new Movie("Soul", new NewReleasePrice()), 3));


        System.out.println(customer.statement(new TextStatement()));

    }
}
