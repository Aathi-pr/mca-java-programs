import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Method to read employee details
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextDouble();
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Number : " + eNo);
        System.out.println("Employee Name   : " + eName);
        System.out.println("Employee Salary : " + eSalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Array of objects
        Employee[] emp = new Employee[n];

        // Read employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].read();
        }

        // Search employee by eNo
        System.out.print("\nEnter employee number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found!");
        }

        sc.close();
    }
}

