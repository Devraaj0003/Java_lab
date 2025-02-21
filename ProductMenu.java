import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);  // Sorting by name
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class ProductMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Sort Products by Name");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
                sc.nextLine();  // Consume the newline character
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();  // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    // Add Product
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    double price;
                    while (true) {
                        try {
                            System.out.print("Enter product price: ");
                            price = sc.nextDouble();
                            sc.nextLine();  // Consume the newline character
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid price! Please enter a valid number.");
                            sc.nextLine();  // Clear invalid input
                        }
                    }
                    productList.add(new Product(name, price));
                    System.out.println("Product added.");
                    break;

                case 2:
                    // Sort Products by Name
                    Collections.sort(productList);
                    System.out.println("Products sorted by name.");
                    break;

                case 3:
                    // Display Products
                    if (productList.isEmpty()) {
                        System.out.println("No products to display.");
                    } else {
                        System.out.println("Products in the list:");
                        for (Product product : productList) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
