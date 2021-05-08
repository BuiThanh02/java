package Java202_203;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("contact1", "0984673846"));
        contacts.add(new Contact("contact2", "0984673847"));
        contacts.add(new Contact("contact3", "0984673848"));
        contacts.add(new Contact("contact4", "0984673849"));
        contacts.add(new Contact("contact5", "0984673840"));
        contacts.add(new Contact("contact6", "0984673841"));
        contacts.add(new Contact("contact7", "0984673842"));
        contacts.add(new Contact("contact8", "0984673843"));
        int n = 0;

        do{
            System.out.println("Act with your contact list: ");
            System.out.println("1. End action.");
            System.out.println("2. Add new contact.");
            System.out.println("3. Print your list.");
            System.out.println("4. Alter your contact name.");
            System.out.println("5. Delete a contact from the list.");
            System.out.println("6. Search a contact.");
            n = scan.nextInt();
            switch (n) {
                case 1 -> System.out.println("Thank you for using our program.");
                case 2 -> getAdd(contacts);
                case 3 -> getPrint(contacts);
                case 4 -> getAlter(contacts);
                case 5 -> getDelete(contacts);
                case 6 -> getSearch(contacts);
            }
        }while(n != 1);
    }

    static class Contact{
        private String name;
        private String number;

        public Contact(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    public static void getAdd(List<Contact> contacts){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter contact name.");
        String name = scan.next();
        System.out.println("Enter phone number");
        String number = scan.next();
        contacts.add(new Contact(name, number));
        System.out.println("Add complete");
    }

    public static void getPrint(List<Contact> contacts){
        System.out.println("Your contacts list: ");
        contacts.forEach(contact -> {
            System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
        });
    }

    public static void getAlter(List<Contact> contacts){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact name that you want to alter: ");
        String name = scan.next();
        System.out.println("Enter the new name: ");
        String newName = scan.next();
        System.out.println("Enter the contact number that you want to alter: ");
        String number = scan.next();
        System.out.println("Enter the new name: ");
        String newNumber = scan.next();
        Contact contact = new Contact(name, number);
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).equals(contact)){
                contacts.set(i, new Contact(newName, newNumber));
            }
            else
                System.out.println("The name you enter does not exits.");
        }
    }

    public static void getDelete(List<Contact> contacts){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact name that you want to delete: ");
        String contact = scan.next();
        boolean delete = contacts.remove(contact);
        if (!delete){
            System.out.println("The name you enter does not exits");
        }
        else
            System.out.println("Delete complete.");
    }

    public static void getSearch(List<Contact> contacts){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter contact name: ");
        String name = scan.next();
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).equals(name)){
                System.out.println("The contact have exits.");
                System.out.println(contacts.get(i));
            }
        }
    }
}
