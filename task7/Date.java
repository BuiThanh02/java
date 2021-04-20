package task7;

public class Date {

    private byte day;
    private byte month;
    private short year;

    public Date(byte day, byte month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day:" + day +
                ", month:" + month +
                ", year:" + year +
                '}';
    }
}
