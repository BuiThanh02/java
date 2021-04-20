package ss6;

public class Triangle {
    private Point a, b, c;
    private double perimeter, ab, ac, bc;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getAb() {
        return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }

    public double getAc() {
        return Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
    }

    public double getCb() {
        return Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
    }

    public double getPerimeter(){
        return (getAb() + getAc() + getCb());
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }
}
