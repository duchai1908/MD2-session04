package btsession04;

import java.util.Scanner;

public class Circle {
    private double radius;
    private  String color;

    public Circle() {
        this.radius = 0.0;
        this.color = "";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuVi(){
        return 2*Math.PI*radius;
    }
    public double dienTich(){
        return Math.PI * Math.pow(radius,2);
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính");
        this.radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào màu sắc");
        this.color = sc.nextLine();
    }
    public void displayData(){
        System.out.println("Bán kính: "+radius);
        System.out.println("Màu sắc: "+color);
        System.out.println("Chu vi: " +chuVi());
        System.out.println("Diện tích: "+dienTich());
    }
}
