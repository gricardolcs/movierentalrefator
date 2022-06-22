package com.jalasoft;

public class Rental {

     private Movie movieName;
     private int daysRented;
	
     public Rental(Movie movie, int daysRented) {
         movieName = movie;
         this.daysRented = daysRented;
     }

    public int getDaysRented() {
        return daysRented;
     }

    public Movie getMovie() {
        return movieName;
     }

    public double amount() {
        return getMovie().amount(getDaysRented());
    }

    int renterPoints(int daysRented) {
        return getMovie().renterPoints(daysRented);
    }

}
