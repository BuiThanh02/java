package CustomerList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static CustomerList customerList = new CustomerList();

    public static void main(String[] args) {

        boolean quit = false;
        while(!quit){
            printAction();
            System.out.println("Enter your action: ");
            int action = scan.nextInt();
            switch (action){
                case 1:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 2:
                    customerList.printCustomerList();
                    break;
                case 3:
                    addCustomerList();
                    break;
                case 4:
                    updateCustomerList();
                    break;
                case 5:
                    removeCustomerList();
                    break;
            }
        }
    }

    private static void updateCustomerList() {
        System.out.println("Enter customer name: ");
        String name = scan.nextLine();
        if (customerList.existCustomer(name) == false){
            System.out.println("Customer doesn't exist.");
            return;
        }
        System.out.println("Enter the new name: ");
        String newName = scan.nextLine();
        System.out.println("Enter the new phone: ");
        String newPhone = scan.nextLine();
        Customers newCustomer = Customers.createCustomer(newName, newPhone);
        if (customerList.updateCustomerList(newCustomer)){
            System.out.println("Update success.");
        }else{
            System.out.println("Update fail.");
        }
    }

    private static void addCustomerList() {
        System.out.println("Enter customer name: ");
        String name = scan.nextLine();
        System.out.println("Enter customer phone: ");
        String phone = scan.nextLine();
        Customers newCustomer = Customers.createCustomer(name, phone);

        if (customerList.addCustomerList(newCustomer)){
            System.out.println("The customer added success");
        }
        else {
            System.out.println("The customer doesn't exist.");
        }
    }

    private static void removeCustomerList() {
        System.out.println("Enter customer name: ");
        String name = scan.nextLine();
        if (customerList.existCustomer(name)){
            System.out.println("Customer exist.");
            if (customerList.removeCustomerList(name)){
                System.out.println("Remove success.");
            }
            else{
                System.out.println("Remove fail.");
                return;
            }
        }
        return;
    }

    private static void printAction() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("1 - to shutdown\n" +
                "2 - to print contacts\n" +
                "3 - to add a new contact\n" +
                "4 - to update existing an existing contact\n" +
                "5 - to remove an existing contact\n");
        System.out.println("Choose your action: ");
    }

}
