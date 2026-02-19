import java.util.Scanner;
class Employee {
  int eNo;
  String eName;
  double eSalary;

  Employee (int eNo, String eName, double eSalary) {
    this.eNo = eNo;
    this.eName = eName;
    this.eSalary = eSalary;
  }

  void display() {
    System.out.println("Employee Number : " + eNo);
    System.out.println("Employee Name : " + eName);
    System.out.println("Employee Salary : " + eSalary);
  }
}

  class Employee1 {
    public static void main(String[] ar) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of employee : ");
      int n = sc.nextInt();

      Employee[] employees = new Employee[n];

      for(int i = 0;i < n; i++) {
        System.out.println("Enter the details of Employee " + (i + 1));
        System.out.print("Enter employee number : ");

        int eNo = sc.nextInt();

        System.out.print("Enter employee Name : ");
        String eName = sc.next();
        
        System.out.print("Enter Employee Salary");
        double eSalary = sc.nextDouble();

        employees[i] = new Employee(eNo, eName, eSalary);

      }

      System.out.print("Enter the employee number to search : ");
      int searchNo = sc.nextInt();

      boolean found = false;
      for(int i = 0;i < n; i++) {
        if (employees[i].eNo == searchNo) {
          System.out.println("Employee found : ");
          employees[i].display();
          found = true;
          break;
        }
      }

      if(!found) {
        System.out.println("Employee with number " + searchNo + "Not found!");
      }
    }
  }
