package Test;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the money your want to borrow: ");
        double balance = scan.nextDouble();
        System.out.println("Enter your annual interest rate: ");
        double rate = scan.nextDouble();

        Bank i1 = new Bank(balance, rate);
        System.out.println("Your interest is: " + i1.calculateInterest());
    }
}
