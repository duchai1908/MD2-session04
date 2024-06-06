package btsession04.bt07;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    private double getRadius() {
        return radius;
    }
    private double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
