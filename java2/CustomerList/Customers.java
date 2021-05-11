package CustomerList;

public class Customers {

    private String name;
    private String phone;

    public Customers(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public static Customers createCustomer(String name, String phone){
        return new Customers(name, phone);
    }
}
