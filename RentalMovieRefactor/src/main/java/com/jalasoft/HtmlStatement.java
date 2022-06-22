package com.jalasoft;

public class HtmlStatement extends Statement
{
    @Override
    protected String header(String name) {
        return "<h2>" + name + "</h2>\n";
    }

    @Override
    protected String lineItem(Movie movie, double amount) {
        return "<b>" + movie.getTitle() + "</b>: " + amount + "\n";
    }

    @Override
    protected String footer(double totalAmount, int frequentRenterPoints) {
        return "<br/>You owe " + totalAmount + "\n";
    }
}
