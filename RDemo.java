import java.util.Scanner;

interface Printable {
    void display();
    void show();
}

interface Computable {
    double area();
    double perimeter();
    double volume();
}

interface Drawable {
    void draw();
}

class Rectangle implements Printable, Computable, Drawable {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    @Override
    public void show() {
        System.out.println("Rectangle Details: Length = " + length + ", Width = " + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double volume() {
        return -1; // Rectangles are 2D, so no volume.
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class Sphere implements Printable, Computable, Drawable {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Radius: " + radius);
    }

    @Override
    public void show() {
        System.out.println("Sphere Details: Radius = " + radius);
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a sphere...");
    }
}

public class RDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        
        Rectangle r = new Rectangle(length, width);
        r.display();
        r.show();
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Volume: " + r.volume());
        r.draw();

        // Sphere
        System.out.print("\nEnter the radius of the sphere: ");
        double radius = sc.nextDouble();
        
        Sphere s = new Sphere(radius);
        s.display();
        s.show();
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
        System.out.println("Volume: " + s.volume());
        s.draw();

        sc.close();
    }
}
