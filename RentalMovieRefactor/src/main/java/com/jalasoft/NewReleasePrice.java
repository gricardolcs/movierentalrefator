package com.jalasoft;

public class NewReleasePrice extends Price {
    public double amount(int daysRented) {
        return (double) (daysRented * 3);
    }

    public int renterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
