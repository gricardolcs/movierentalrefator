package com.jalasoft;

public class TextStatement extends Statement {
    protected String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    protected String lineItem(Movie movie, double amount) {
        return "\t" + movie.getTitle() + "\t" + String.valueOf(amount) + "\n";
    }

    protected String footer(double totalAmount, int frequentRenterPoints) {
        String footer1 = "You owed " + String.valueOf(totalAmount) + "\n";
        String footer2 = "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return footer1 + footer2;
    }
}
