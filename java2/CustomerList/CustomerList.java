package CustomerList;

import java.util.ArrayList;

public class CustomerList {

    private ArrayList<Customers> myCustomer;

    public CustomerList() {
        this.myCustomer = new ArrayList<Customers>();
    }

    boolean addCustomerList(Customers customers){
        if (findCustomer(customers) >= 0){
            return false;
        }
        myCustomer.add(customers);
        return true;
    }

    boolean updateCustomerList(Customers customer){
        if (findCustomer(customer) <= 0){
            return false;
        }
        myCustomer.set(findCustomer(customer), customer);
        return true;
    }

    boolean removeCustomerList(String name){
        if (findCustomer(name) < 0){
            return false;
        }
        myCustomer.remove(findCustomer(name));
        System.out.println(name.getName() + " was deleted.");
        return true;
    }

    private int findCustomer(Customers customer){
        return myCustomer.indexOf(customer);
    }

    private int findCustomer(String name){
        for (int i = 0; i < myCustomer.size(); i++){
            if (myCustomer.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void printCustomerList(){
        System.out.println("Your customer list: ");
        for (int i = 0; i < myCustomer.size(); i++){
            System.out.println((i + 1) + "." + " " +
                    myCustomer.get(i).getName() + ": " +
                    myCustomer.get(i).getPhone());
        }
    }

    public boolean existCustomer(String name){
        if (findCustomer(name) >= 0){
            System.out.println("Customer exist.");
            return true;
        }
        return false;
    }
}
