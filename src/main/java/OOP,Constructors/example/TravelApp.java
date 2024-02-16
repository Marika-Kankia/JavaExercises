package org.example;
import java.util.Random;
//Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

import java.util.ArrayList;

public class TravelApp {
    private ArrayList<org.example.Flight>flights;
    private ArrayList <org.example.Hotel> hotels;
    public TravelApp() {
        this.flights = new ArrayList <org.example.Flight> ();
        this.hotels = new ArrayList <org.example.Hotel> ();
    }
    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
    }
    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        org.example.Flight flight = new org.example.Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        int confirmationNumber = generateConfirmationNumber();
        flight.setConfirmationNumber(confirmationNumber);
        this.flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        org.example.Hotel hotel = new org.example.Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        int confirmationNumber = generateConfirmationNumber();
        hotel.setConfirmationNumber(confirmationNumber);
        this.hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
    }

    public void cancelReservation(int confirmationNumber) {
        // Cancel a flight or hotel reservation based on confirmation number
        for (org.example.Flight flight: this.flights) {
            if (flight.getConfirmationNumber() == confirmationNumber) {
                this.flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }
        for (org.example.Hotel hotel: this.hotels) {
            if (hotel.getConfirmationNumber() == confirmationNumber) {
                this.hotels.remove(hotel);
                System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }
        System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
    }

    private int generateConfirmationNumber() {
        // Generate a random 6-digit confirmation number
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }

    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.searchFlights("New York", "London", "2022-09-01", 1);
        app.searchHotels("London", "2022-08-01", "2022-09-05", 2);
        app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
        app.bookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00);
        app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);
        // Cancel a flight or hotel reservation based on reservation number
        app.cancelReservation(12345670);
    }

}
