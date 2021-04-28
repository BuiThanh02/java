package Practice;

import java.util.Scanner;

public class Animal {
    protected String name;
    Scanner scan = new Scanner(System.in);

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void eat(Food food, int m){
        System.out.println("Cho an " + m);
        System.out.println("So thuc an con lai la: " + food.foodLeft(m));
    }

    protected String haveBaby(){
            System.out.println("Nhap ten cho con vat moi sinh: ");
            String name = scan.next();
            return "Con moi sinh la: " + name;
    }

    public void scanInfor(){

    }
}
