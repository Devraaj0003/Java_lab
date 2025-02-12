import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}


class Circle implements Shape {
    double radius;

    
    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

 
    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}


class Rectangle implements Shape {
    double length, width;

   
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

   
    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}


public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter radius of circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                    break;
                    
                case 2: 
                    System.out.print("Enter length of rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.area();
                    rectangle.perimeter();
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}
