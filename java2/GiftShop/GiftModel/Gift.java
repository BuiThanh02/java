package GiftShop.GiftModel;

public class Gift {
    private int id;
    private String bname;
    private String aname;
    private double price;
    private int qty;

    public Gift(int id, String bname, String aname, double price, int qty) {
        this.id = id;
        this.bname = bname;
        this.aname = aname;
        this.price = price;
        this.qty = qty;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
