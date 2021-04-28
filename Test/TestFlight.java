package Test;

import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter the flight number: ");
        number = scan.nextInt();
        do{
            System.out.println("Please enter the positive-valued.");
            System.out.println("Enter the flight number: ");
            number = scan.nextInt();
        }while(number < 0);
        System.out.println("Enter the flight destination: ");
        String destination = scan.next();
        Flight f1 = new Flight(number, destination);
        f1.display();
    }
}
