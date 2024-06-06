package btsession04.bt02;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0; // Trả về 0 nếu delta < 0
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0; // Trả về 0 nếu delta < 0
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}
