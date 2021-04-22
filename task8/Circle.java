package task8;

public class Circle {
     private  double radius;

     public Circle(double radius){
         this.radius = radius;
     }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
         return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
