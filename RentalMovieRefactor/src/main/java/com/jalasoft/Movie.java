package com.jalasoft;

public class Movie {
    private String movieTitle;
    private Price price;

    public Movie(String title, Price price) {
        movieTitle = title;
        this.price = price;
    }

    public String getTitle() {
        return movieTitle;
    }

    public double amount(int daysRented) {
        return price.amount(daysRented);
    }

    public int renterPoints(int daysRented) {
        return price.renterPoints(daysRented);
    }
}
