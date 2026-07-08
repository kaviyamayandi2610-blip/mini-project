import java.util.Scanner;

class Employee {

    int empId;
    String empName;
    double basicSalary;
    double hra;
    double da;
    double totalSalary;

    Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        basicSalary = salary;

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        totalSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("\n--------- Employee Details ---------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA (20%) : " + hra);
        System.out.println("DA (10%) : " + da);
        System.out.println("Total Salary : " + totalSalary);
    }
}

public class employeesalarysystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary : ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.displayDetails();

        sc.close();
    }
}