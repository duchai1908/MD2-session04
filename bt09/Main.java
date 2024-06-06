package btsession04.bt09;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student[] students = new Student[100];
        do {
            System.out.println("**************MENU**************");
            System.out.println("1.Hiển thị danh sách tất cả học sinh");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4.Xoá học sinh");
            System.out.println("5.Thoát");
            System.out.println("********************************");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayList(students);
                    break;
                case 2:
                    addStudent(students);
                    break;
                case 3:
                    updateStudent(students);
                    break;
                case 4:
                    deleteStudent(students);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai lựa chọn, mời nhập lại");
            }
        } while (true);
    }
    private static void deleteStudent(Student[] students){
        System.out.println("Nhập mã SV");
        String studentId = sc.nextLine();
        boolean checkStudentId = true;
        for (int i = 0; i < students.length; i++) {
            if (studentId.equals(students[i].getStudentId())) {
                checkStudentId = false;
                students[i] = null;
                break;
            }
        }
//        for (Student student : students) {
//            if (student.getStudentId().equals(studentId)) {
//                student = null;
//                checkStudentId = false;
//                break;
//            }
//        }
        if (checkStudentId) {
            System.out.println("Không tìm thấy Student");
        }
    }
    private static void updateStudent(Student[] students) {
        System.out.println("Nhập mã SV");
        String studentId = sc.nextLine();
        boolean checkStudentId = true;
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.inputData();
                checkStudentId = false;
                break;
            }
        }
        if (checkStudentId) {
            System.out.println("Không tìm thấy Student");
        }
    }
    private static void displayList(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                student.displayData();
            }
        }
    }
    private static void addStudent(Student[] students) {
        Student student = new Student();
        student.inputData();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
}
