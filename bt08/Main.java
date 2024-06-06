package btsession04.bt08;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(001,"Quang Tran",28,"Nam",3);
        employee.inputData();
        employee.displayData();
        Employee employee1 = new Employee();
        employee1.inputData();
        employee1.displayData();
        Employee employee2 = new Employee();
        employee2.inputData();
        employee2.displayData();
        Employee employee3 = new Employee();
        employee3.inputData();
        employee3.displayData();
        Employee employee4 = new Employee();
        employee4.inputData();
        employee4.displayData();
    }
}
