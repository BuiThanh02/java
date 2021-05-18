package GiftShop.GiftView;

import GiftShop.GiftModel.*;
import GiftShop.GiftController.*;
import java.util.Scanner;

public class GiftShop {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        String aname;
        String bname;
        String p;
        String s;
        String q;
        int id;
        int qty;
        double price;
        while (true){
            System.out.println("\nChoose action: ");
            System.out.println("1. End program.");
            System.out.println("2. Print book list.");
            System.out.println("3. Insert new book.");
            System.out.println("4. Update book.");
            System.out.println("5. Delete book.");

            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 1:
                    System.out.println("\nThank you for using our program.");
                    quit = true;
                    break;
                case 2:
                    GiftController gift = new GiftController();
                    gift.displayBook();
                case 3:
                    GiftController addGift = new GiftController();
                    System.out.println("Enter the new id: ");
                    s = scan.nextLine();
                    id = Integer.parseInt(s);
                    System.out.println("Enter the new book name: ");
                    bname = scan.nextLine();
                    System.out.println("Enter the new author name: ");
                    aname = scan.nextLine();
                    System.out.println("Enter the new price: ");
                    p = scan.nextLine();
                    price = Double.parseDouble(p);
                    System.out.println("Enter new qty: ");
                    q = scan.nextLine();
                    qty = Integer.parseInt(q);
                    Gift newGift = new Gift(id, bname, aname, price, qty);
                    addGift.insertBook(newGift);
                case 4:
                    GiftController updateGift = new GiftController();
                    System.out.println("Enter book id: ");
                    String i = scan.nextLine();
                    int newID = Integer.parseInt(i);
                    System.out.println("Enter the new id: ");
                    s = scan.nextLine();
                    id = Integer.parseInt(s);
                    System.out.println("Enter the new book name: ");
                    bname = scan.nextLine();
                    System.out.println("Enter the new author name: ");
                    aname = scan.nextLine();
                    System.out.println("Enter the new price: ");
                    p = scan.nextLine();
                    price = Double.parseDouble(p);
                    System.out.println("Enter new qty: ");
                    q = scan.nextLine();
                    qty = Integer.parseInt(q);
                    Gift newUpdate = new Gift(id, bname, aname, price, qty);
                    updateGift.updateBook(newUpdate, newID);
                case 5:
                    GiftController deleteGift = new GiftController();
                    System.out.println("Enter id: ");
                    s = scan.nextLine();
                    id = Integer.parseInt(s);
                    deleteGift.deleteBook(id);
            }
        }
    }
}
