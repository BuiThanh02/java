package BaiKT;

import CustomerList.CustomerList;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static StudentList studentList = new StudentList();

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit){
            printAction();
            System.out.println("\nEnter action: ");
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 4:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentList.printStudent();
                    break;
                case 3:
                    studentList.save();
                    break;
            }
        }
    }

    private static void printAction() {
        System.out.println("1. Add student records.");
        System.out.println("2. Display student records.");
        System.out.println("3. Save.");
        System.out.println("4. Exit.");
    }

    private static void addStudent(){
        String newID;
        String name;
        String address;
        String phone;
        System.out.println("Enter new student ID : ");
        newID = scan.nextLine();
        System.out.println("Enter student name: ");
        name = scan.nextLine();
        System.out.println("Enter student address: ");
        address = scan.nextLine();
        System.out.println("Enter student phone: ");
        phone = scan.nextLine();
        Student newStudent = Student.createNewStudent(newID, name, address, phone);
        if (studentList.addNewStudent(newStudent)){
            System.out.println("New student added.");
        }else{
            System.out.println("Cannot add, " + name + "already on file");
        }
    }
}
