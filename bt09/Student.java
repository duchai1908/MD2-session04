package btsession04.bt09;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private String studentAddress;
    private int studentAge;
    private String studentGender;
    private long studentPhoneNumber;

    public Student() {
    }

    public Student(String studentId, String studentName, String studentAddress, int studentAge, String studentGender, long studentPhoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentPhoneNumber = studentPhoneNumber;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextLine();
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter student address: ");
        studentAddress = sc.nextLine();
        System.out.print("Enter student age: ");
        studentAge = Integer.parseInt(sc.nextLine());
        System.out.print("Enter student gender: ");
        studentGender = sc.nextLine();
        System.out.print("Enter student phone number: ");
        studentPhoneNumber = Long.parseLong(sc.nextLine());
        System.out.println("Nhập thông tin thành công");
    }
    public void displayData(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Gender: " + studentGender);
        System.out.println("Student Phone Number: " + studentPhoneNumber);
        System.out.println("**************************************");
    }
    public String getStudentId() {
        return studentId;
    }
}
