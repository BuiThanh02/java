package ss6;

public class TestTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,6);
        Point p3 = new Point(8, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Triangle peri = new Triangle(p1, p2, p3);

        if (peri.getCb() + peri.getAc() > peri.getAb()){
            System.out.println(peri.getPerimeter());
        }
        else {
            System.out.println("Not a triangle");
        }
    }
}
