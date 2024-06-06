package btsession04.bt08;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private int rate;
    private int salary;

    public Employee() {
        employeeId = 0;
        employeeName = "";
        age = 0;
        gen="";
        rate = 0;
        salary = 0;
    }
    public Employee(int employeeId, String employeeName, int age, String gen, int rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employeeId = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        employeeName = new Scanner(System.in).nextLine();
        System.out.println("Enter Employee Age: ");
        age = sc.nextInt();
        System.out.println("Enter Employee Genre: ");
        gen = new Scanner(System.in).nextLine();
        System.out.println("Enter Employee Rate: ");
        rate = sc.nextInt();
    }
    public void displayData(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Genre: " + gen);
        System.out.println("Employee Rate: " + rate);
        System.out.println("Employee Salary: " + calSalary());
    }
    public int calSalary(){
        salary = rate*1300000;
        return salary;
    }
}
