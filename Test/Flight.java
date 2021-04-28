package Test;

public class Flight {
    private int number;
    private String destination;

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public Flight(){}

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void display(){
        System.out.println("The flight information: ");
        System.out.println("Flight number: " + number);
        System.out.println("Destination: " + destination);
    }
}
