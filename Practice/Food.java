package Practice;

public class Food {
    private int mass;

    public Food(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int foodLeft(int m){
        return this.mass = mass - m;
    }

    @Override
    public String toString() {
        return "So luong thuc an con lai la: " + mass;
    }
}
