package com.jalasoft;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Rental> myRentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.customerName = name;
    }

    public void addRental(Rental rental) {
        myRentals.add(rental);
    }

    public String getName() {
        return customerName;
    }

    public String statement(Statement statement) {

    return statement.statement(getName(),
        this.myRentals, totalAmount(this.myRentals),
            frequentRenterPoints(this.myRentals));
    }

    private double totalAmount(Iterable<Rental> rentals) {
        double totalAmount = 0;
        for (Rental each : rentals) {
            double thisAmount = each.amount();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private int frequentRenterPoints(Iterable<Rental> rentals) {
        int totalRenterPoints = 0;
        for (Rental each : rentals) {
            totalRenterPoints += each.renterPoints(each.getDaysRented());
        }
        return totalRenterPoints;
    }

}
