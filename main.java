import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Greeting message
    System.out.println("================================");
    System.out.println("   Invetory Management System   ");
    System.out.println("================================");

    System.out.println("Welcome! Manage your invetory here!");
    System.out.println("");

    // Menu options 
    System.out.println("============= Menu =============");
    System.out.println("");
    System.out.println("1. Add A Product");
    System.out.println("2. View All Product");
    System.out.println("3. Search A Product");
    System.out.println("4. Update Stock");
    System.out.println("5. Remove Product");
    System.out.println("6. Low Stock Alert");
    System.out.println("7. Invetory Summary");
    System.out.println("8. Exit");
    System.out.println("================================");

    System.out.print("Enter your choice (1-8): ");
    int choice = scanner.nextInt();

        switch (choice) {

        case 1:
    // Adding a product
        System.out.println("========== Add A Product ==========");
        System.out.print("Enter product ID: ");
        String productID = scanner.next();
        System.out.print("Enter product name: ");
        String productName = scanner.next();
        System.out.print("Enter product category: ");
        String productCategory = scanner.next();
        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Enter product quantity in stock: ");
        int productQuantity = scanner.nextInt();
        System.out.println("Enter minimum stock level: ");
        int minStockLevel = scanner.nextInt();
        System.out.println("");
        System.out.println("Product information recorded successfully!");


    // Viewing Products
                

        }
    scanner.close();
    }
}