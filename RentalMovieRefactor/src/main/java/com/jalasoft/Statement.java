package com.jalasoft;
import java.util.List;

public abstract class Statement {
    protected abstract String header(String name);

    protected abstract String lineItem(Movie movie, double amount);

    protected abstract String footer(double totalAmount, int frequentRenterPoints);

    public String statement(String name, List<Rental> rentals, double totalAmount, int totalRenterPoints) {
        String result = header(name);

        for (Rental each : rentals) {
            result += lineItem(each.getMovie(), each.amount());
        }

        result += footer(totalAmount, totalRenterPoints);

        return result;
    }
}
