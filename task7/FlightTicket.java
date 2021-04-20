package task7;

import java.util.Scanner;

public class FlightTicket {

    private  Date departureDate;
    private Time departureTime;
    private byte noOfTicket;
    private double price;
    private double totalPrice;
    private byte typeOfCabin;

    public FlightTicket(Date departureDate, Time departureTime, byte noOfTicket, double price, double totalPrice, byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.noOfTicket = noOfTicket;
        this.price = price;
        this.totalPrice = totalPrice;
        this.typeOfCabin = typeOfCabin;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void displayTicketInformation(){
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("________________________________________________________");
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Number of tickets: " + noOfTicket);
        System.out.println("Type of cabin: " + typeOfCabin);
        System.out.println("Total cost of the ticket: " + totalPrice);
    }
}
