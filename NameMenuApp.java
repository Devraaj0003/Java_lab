import java.util.ArrayList;
import java.util.Scanner;

class NameList {
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        if (names.remove(name)) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println(name + " found.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void displayNames() {
        if (names.isEmpty()) {
            System.out.println("No names to display.");
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

public class NameMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameList nameList = new NameList();
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Search Name");
            System.out.println("4. Display Names");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    nameList.addName(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    nameList.removeName(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    nameList.searchName(sc.nextLine());
                    break;
                case 4:
                    nameList.displayNames();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
