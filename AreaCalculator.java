import java.util.Scanner;

class AreaCalculator {

    // Area of Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double area(double base, double height, int t) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area of Circle: " + obj.area(r));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + obj.area(l, b));
                    break;

                case 3:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Area of Triangle: " + obj.area(base, h, 1));
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

