package employee.main;

import employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Nafis";
        employee1.id = 23918022;
        employee1.salary = 100.000f;
        employee1.fullTime = true;

        System.out.println("Employee Name:" + employee1.name);
        System.out.println("Employee ID:"+ employee1.id);
        System.out.println("Employee Salary:" + employee1.salary);

    }
    
}
