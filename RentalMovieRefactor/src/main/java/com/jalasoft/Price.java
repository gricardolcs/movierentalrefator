package com.jalasoft;

public abstract class Price {
    abstract double amount(int daysRented);

    public int renterPoints(int daysRented) {
        return 1;
    }
}
