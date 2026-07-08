import java.util.Scanner;

class EmployeeDetails {

    String name;

    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }
}

class FullTime extends EmployeeDetails {

    int salary;

    void getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    void display() {
        System.out.println("\nEmployee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class payroll {

    public static void main(String[] args) {

        FullTime emp = new FullTime();

        emp.getName();
        emp.getSalary();
        emp.display();
    }
}
