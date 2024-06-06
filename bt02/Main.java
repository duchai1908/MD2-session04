package btsession04.bt02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = sc.nextInt();
        System.out.println("Nhập số b");
        int b = sc.nextInt();
        System.out.println("Nhập số c");
        int c = sc.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if(delta>0){
            System.out.println("x1 = "+equation.getRoot1());
            System.out.println("x2 = "+equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("chương trình có 1 nghiệm duy nhất = "+equation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
